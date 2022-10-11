import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CanvasTest {
    @Test
    void testArray() {
        String expected=
                "I have drawn a circle\n" +
                "I have drawn a rectangle\n";

        ArrayList<String> arr=new ArrayList<>();
        arr.add("circle");
        arr.add("rectangle");
        arr.add("triangle");

        StringBuilder string= new StringBuilder();
        for(String s:arr){
            if(s == "circle")
            {
                DrawCircle circle= new DrawCircle();
                String str=circle.drawShape();
                string.append(str);
            }
            else if(s == "rectangle")
            {
                DrawRectangle rectangle= new DrawRectangle();
                String str=rectangle.drawShape();
                string.append(str);
            }
        }
        assertEquals(expected, string.toString());
    }
}
