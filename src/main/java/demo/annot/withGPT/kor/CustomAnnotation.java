package demo.annot.withGPT.kor;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {
    // 어노테이션 속성 정의
}
