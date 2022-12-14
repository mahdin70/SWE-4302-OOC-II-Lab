package PreviousLabs.Lab4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_Canvas {
    public ArrayList<String> arr;

    public Task2_Canvas() {
        arr = new ArrayList<>(Arrays.asList("circle","rectangle","triangle","circle"));
    }
    public String DrawCircle(int times){
        String s="";
        for(int i=0;i<times;i++) {
            s=s+"circle\n";
        }
        return s;
    }

    public String DrawRectangle(int times){
        String s="";
        for(int i=0;i<times;i++) {
            s=s+"rectangle\n";
        }
        return s;
    }

    public String DrawTriangle(int times){
        String s="";
        for(int i=0;i<times;i++){
            s=s+"triangle\n";
        }
        return s;
    }
}
