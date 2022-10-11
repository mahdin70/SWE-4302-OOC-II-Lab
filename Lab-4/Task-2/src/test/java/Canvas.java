import java.util.ArrayList;
import java.util.Arrays;
public class Canvas {
    ArrayList<String> arr;
    public Canvas() {
        arr = new ArrayList<>(Arrays.asList("circle","rectangle","triangle","circle"));
    }
    public String DrawCircle(int times){
        StringBuilder s= new StringBuilder();
        for(int i=0;i<times;i++) {
            s.append("circle\n");
        }
        return s.toString();
    }
    public String DrawRectangle(int times){
        StringBuilder s= new StringBuilder();
        for(int i=0;i<times;i++) {
            s.append("rectangle\n");
        }
        return s.toString();
    }
    public String DrawTriangle(int times){
        StringBuilder s= new StringBuilder();
        for(int i=0;i<times;i++){
            s.append("triangle\n");
        }
        return s.toString();
    }
}
