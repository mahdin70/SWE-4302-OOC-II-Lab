package PreviousLabs.Lab7.Task1;

public class MastersProgram {
    private IMastersProgram type;

    public MastersProgram(DegreeType degreeType, String major) {
        MastersFactory factory = new MastersFactory();
        type = factory.chooseMastersProgram(degreeType, major);
    }

    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa, major);
    }

    public int getMarks(int theoryMarks, int thesisMarks, int presentMarks) {
        return type.getMarks(theoryMarks, thesisMarks, presentMarks);
    }
}
