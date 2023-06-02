package demo.annot.withGPT.kor;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("demo.annot.withGPT.kor.CustomAnnotation")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class CustomAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement annotation : annotations) {
            for (Element element : roundEnv.getElementsAnnotatedWith(annotation)) {
                if (element.getKind() == ElementKind.METHOD) {
                    ExecutableElement methodElement = (ExecutableElement) element;
                    System.out.println("Method name: " + methodElement.getSimpleName());
                    
                    // 원하는 코드 삽입
                    String code = "System.out.println(\"Method execution start\");\n"
                            + element.toString() + "\n"
                            + "System.out.println(\"Method execution end\");";
                    System.out.println("Generated code:\n" + code);
                }
            }
        }
        return true;
    }
}