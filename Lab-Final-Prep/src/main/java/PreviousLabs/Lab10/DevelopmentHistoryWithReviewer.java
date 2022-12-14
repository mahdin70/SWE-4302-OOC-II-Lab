package PreviousLabs.Lab10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface DevelopmentHistoryWithReviewer {
    DevelopmentHistory developmentHistory();
    String[] Reviewer();
}
