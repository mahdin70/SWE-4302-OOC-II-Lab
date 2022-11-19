import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface DevelopmmentHistory {
    String Developer();
    String Tester() default "";
    int Version() default 1;

}
