package Task_1;

public class ExecutiveMasterProgram implements IMastersProgram {

    private final String major;
    public ExecutiveMasterProgram(String major){
        this.major=major;
    }
    @Override
    public boolean isEligible(float cgpa, String major) {
        return (cgpa >= 3.75 || this.equals(major));
    }
    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int presentMarks) {
        return theoryMarks+thesisMarks+presentMarks;
    }
}
