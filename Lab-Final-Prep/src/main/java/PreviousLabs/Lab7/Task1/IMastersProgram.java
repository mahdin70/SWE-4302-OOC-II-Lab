package PreviousLabs.Lab7.Task1;

public interface IMastersProgram {
    boolean isEligible(float cgpa, String major);
    int getMarks(int theoryMarks, int thesisMarks, int presentMarks);
}
