import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD, ElementType.CONSTRUCTOR})

public @interface DevelopmentHistoryWithReviewer {
    DevelopmmentHistory developmentHistory();
    String[] Reviewer();
}
