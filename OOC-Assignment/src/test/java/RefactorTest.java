import Assignment1.Refactor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefactorTest {
    @Test
    public void testRefactoredOperationMethod() {
        Refactor refactor = new Refactor();
        refactor.refactoredOperationMethod(30, 12, 2019);
        assertEquals(31, refactor.day);
        assertEquals(12, refactor.month);
        assertEquals(2019, refactor.year);
    }

    @Test
    public void testRefactoredOperationMethod2() {
        Refactor refactor = new Refactor();
        refactor.refactoredOperationMethod(31, 1, 2019);
        assertEquals(1, refactor.day);
        assertEquals(2, refactor.month);
        assertEquals(2019, refactor.year);
    }

    @Test
    public void testRefactoredOperationMethod3() {
        Refactor refactor = new Refactor();
        refactor.refactoredOperationMethod(28, 2, 2020);
        assertEquals(29, refactor.day);
        assertEquals(2, refactor.month);
        assertEquals(2020, refactor.year);
    }
}
