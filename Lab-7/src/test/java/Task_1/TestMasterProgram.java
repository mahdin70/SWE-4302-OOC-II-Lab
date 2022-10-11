package Task_1;
import org.junit.jupiter.api.Test;
import static Task_1.DegreeType.ExecutiveMasterProgram;
import static org.junit.jupiter.api.Assertions.*;

public class TestMasterProgram {

    @Test
    public void isEligibleThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertTrue(isEligible);
    }
    @Test
    public void getMarksThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.NonRegularThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(100, marks);
    }
    @Test
    public void isEligibleThesisDifferentMajor() {
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }
    @Test
    public void isEligibleExecutive(){
        MastersProgram mp = new MastersProgram(ExecutiveMasterProgram, "swe");
        boolean isEligible = mp.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.76f, "swe");
        assertTrue(isEligible);
    }
}
