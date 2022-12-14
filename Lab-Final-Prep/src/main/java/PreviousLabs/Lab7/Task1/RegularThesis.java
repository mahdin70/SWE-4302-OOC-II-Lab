package PreviousLabs.Lab7.Task1;

public class RegularThesis implements IMastersProgram{
    private final String major;
    public RegularThesis(String major) {
        this.major = major;
    }
    @Override
    public boolean isEligible(float cgpa, String major) {
        return (this.major.equals(major) && cgpa >= 3.8);
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int presentMarks) {
        return theoryMarks + thesisMarks;
    }
}
