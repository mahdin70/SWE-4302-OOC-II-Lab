package Task_1;

public class MastersFactory {
    public IMastersProgram chooseMasterprogram (DegreeType type,String major) {
        IMastersProgram master;
        if(type.equals(DegreeType.RegularThesis)) {
            master = new RegularThesis(major);
        } else if (type.equals(DegreeType.NonRegularThesis)) {
            master = new NonRegularThesis(major);
        } else master = new ExecutiveMasterProgram(major);
        return master;
    }
}
