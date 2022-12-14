import PreviousLabs.Lab4.Task2_Canvas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab4_Task2_Test {
    @Test
    void testArray(){
        Task2_Canvas canvas = new Task2_Canvas();
        String expected = "circle\nrectangle\ntriangle\ncircle\n";
        String str="";
        for(String s:canvas.arr){
            switch (s){
                case "circle":
                    str=str+canvas.DrawCircle(1);
                    break;
                case "rectangle":
                    str=str+canvas.DrawRectangle(1);
                    break;
                case "triangle":
                    str=str+canvas.DrawTriangle(1);
                    break;
            }
        }
        assertEquals(expected,str);
    }

    @Test
    void circle1(){
        Task2_Canvas canvas = new Task2_Canvas();
        String expected = "circle\n";
        String actual = canvas.DrawCircle(1);
        assertEquals(expected,actual);
    }

    @Test
    void circle2(){
        Task2_Canvas canvas = new Task2_Canvas();
        String expected = "circle\ncircle\n";
        String actual = canvas.DrawCircle(2);
        assertEquals(expected,actual);
    }

}
