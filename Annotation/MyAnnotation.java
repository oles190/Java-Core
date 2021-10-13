package Annotation;


import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String name();

}
