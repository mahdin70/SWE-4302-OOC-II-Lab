package PreviousLabs.Lab9;

import java.util.Collection;
import java.util.Collections;

public class ResultPublication {
    public void publish(String obj, StudentEnrollment studentEnrollment){
        if(obj=="Name"){
            studentEnrollment.students.sort(new SortByName());
        }

        else if(obj == "ID"){
            studentEnrollment.students.sort(new SortByID());
        }

        else{
            Collections.sort(studentEnrollment.students,new SortByCGPA());
        }
    }

    public void publish(String obj1, String obj2, StudentEnrollment studentEnrollment){
        if(obj1 == "CGPA" && obj2 == "ID"){
            Collections.sort(studentEnrollment.students,new SortByCGPAandID());
        }
    }
}
