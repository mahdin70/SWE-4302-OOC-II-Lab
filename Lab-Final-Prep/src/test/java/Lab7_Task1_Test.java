import PreviousLabs.Lab7.Task1.DegreeType;
import PreviousLabs.Lab7.Task1.MastersProgram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Lab7_Task1_Test {
    @Test
    void isEligibleTheis(){
        MastersProgram m1 = new MastersProgram(DegreeType.RegularThesis, "Computer Science");
        boolean isEligible = m1.isEligible(3.5f, "Computer Science");
        assertTrue(isEligible);

        isEligible = m1.isEligible(2.0f, "Computer Science");
        assertFalse(isEligible);
    }
}
