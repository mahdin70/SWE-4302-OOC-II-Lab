package PreviousLabs.Lab10;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DevelopmentHistory {
    String Developer();
    String Tester() default "";
    int Version() default 1;
}
