package PreviousLabs.Lab7.Task1;

public class NonRegularThesis {
    private String major;
    public NonRegularThesis(String major) {
        this.major = major;
    }
    public boolean isEligible(float cgpa, String major) {
        return this.major.equals(major);
    }

    public int getMarks(int theoryMarks, int thesisMarks, int presentMarks) {
        return theoryMarks + presentMarks/2;
    }
}
