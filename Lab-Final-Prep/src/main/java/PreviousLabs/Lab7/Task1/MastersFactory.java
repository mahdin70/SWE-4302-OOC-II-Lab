package PreviousLabs.Lab7.Task1;

public class MastersFactory {
    public IMastersProgram chooseMastersProgram(DegreeType degreeType, String major) {
        IMastersProgram program;
        if(degreeType.equals(DegreeType.RegularThesis)) {
            program = new RegularThesis(major);
        }
        else if(degreeType.equals(DegreeType.NonRegularThesis))
            program = (IMastersProgram) new NonRegularThesis(major);
        else {
            program = new ExecutiveMastersProgram(major);
        }
        return program;
    }
}
