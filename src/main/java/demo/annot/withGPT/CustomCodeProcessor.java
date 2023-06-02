package demo.annot.withGPT;

import javax.annotation.processing.*;
import javax.lang.model.*;
import javax.lang.model.element.*;
import java.util.Set;

@SupportedAnnotationTypes("com.example.CustomCode")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class CustomCodeProcessor extends AbstractProcessor {
    
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(CustomCode.class)) {
            if (element.getKind() == ElementKind.METHOD) {
                ExecutableElement methodElement = (ExecutableElement) element;
                String methodName = methodElement.getSimpleName().toString();
                
                // Generate the code you want to insert into the method
                String code = "System.out.println(\"Method " + methodName + " called.\");";
                
                // Get the fully qualified class name
                String className = methodElement.getEnclosingElement().toString();
                
                // Print the generated code
                System.out.println("Generated code for class " + className + ": " + code);
            }
        }
        return true;
    }
}