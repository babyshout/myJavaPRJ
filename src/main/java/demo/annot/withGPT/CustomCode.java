package demo.annot.withGPT;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface CustomCode {
    // Define any attributes or elements for your annotation if needed
}