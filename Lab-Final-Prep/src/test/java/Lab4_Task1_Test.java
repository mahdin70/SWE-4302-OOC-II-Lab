import PreviousLabs.Lab4.Task1_ShamelessGreen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab4_Task1_Test {

    @Test
    void verse0(){
        String expected = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";

        Task1_ShamelessGreen task1 = new Task1_ShamelessGreen();
        String actual = task1.verse(0);
        assertEquals(expected, actual);
    }

    @Test
    void verse1(){
        String expected = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.";

        Task1_ShamelessGreen task1 = new Task1_ShamelessGreen();
        String actual = task1.verse(1);
        assertEquals(expected, actual);
    }

    @Test
    void verse2(){
        String expected = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.";

        Task1_ShamelessGreen task1 = new Task1_ShamelessGreen();
        String actual = task1.verse(2);
        assertEquals(expected, actual);
    }

    @Test
    void verseRange() {
        String expected = "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take one down and pass it around, 68 bottles of beer on the wall." +
                "68 bottles of beer on the wall, 68 bottles of beer.\n" +
                "Take one down and pass it around, 67 bottles of beer on the wall." +
                "67 bottles of beer on the wall, 67 bottles of beer.\n" +
                "Take one down and pass it around, 66 bottles of beer on the wall." +
                "66 bottles of beer on the wall, 66 bottles of beer.\n" +
                "Take one down and pass it around, 65 bottles of beer on the wall.";

        Task1_ShamelessGreen task1 = new Task1_ShamelessGreen();
        String actual = task1.sing(69, 66);
        assertEquals(expected, actual);
    }

    @Test
    void song(){
        String expected = "99 bottles of the beer on the wall,99 bottles of the beer.\n" +
                "Take one down and pass it around, 98 bottles of the beer on the wall.\n" +
                "98 bottles of the beer on the wall, 98 bottles of the beer.\n" +
                "Take one down and pass it around, 97 bottles of the beer on the wall.\n" +
                "97 bottles of the beer on the wall, 97 bottles of the beer.\n" +
                "Take one down and pass it around, 96 bottles of the beer on the wall.\n" +
                "96 bottles of the beer on the wall, 96 bottles of the beer.\n" +
                "Take one down and pass it around, 95 bottles of the beer on the wall.\n" +
                "95 bottles of the beer on the wall, 95 bottles of the beer.\n" +
                "Take one down and pass it around, 94 bottles of the beer on the wall.\n" +
                "94 bottles of the beer on the wall, 94 bottles of the beer.\n" +
                "Take one down and pass it around, 93 bottles of the beer on the wall.\n" +
                "93 bottles of the beer on the wall, 93 bottles of the beer.\n" +
                "Take one down and pass it around, 92 bottles of the beer on the wall.\n" +
                "92 bottles of the beer on the wall, 92 bottles of the beer.\n" +
                "Take one down and pass it around, 91 bottles of the beer on the wall.\n" +
                "91 bottles of the beer on the wall, 91 bottles of the beer.\n" +
                "Take one down and pass it around, 90 bottles of the beer on the wall.\n" +
                "90 bottles of the beer on the wall, 90 bottles of the beer.\n" +
                "Take one down and pass it around, 89 bottles of the beer on the wall.\n" +
                "89 bottles of the beer on the wall, 89 bottles of the beer.\n" +
                "Take one down and pass it around, 88 bottles of the beer on the wall.\n" +
                "88 bottles of the beer on the wall, 88 bottles of the beer.\n" +
                "Take one down and pass it around, 87 bottles of the beer on the wall.\n" +
                "87 bottles of the beer on the wall, 87 bottles of the beer.\n" +
                "Take one down and pass it around, 86 bottles of the beer on the wall.\n" +
                "86 bottles of the beer on the wall, 86 bottles of the beer.\n" +
                "Take one down and pass it around, 85 bottles of the beer on the wall";

        Task1_ShamelessGreen task1 = new Task1_ShamelessGreen();
        String actual = task1.sing(99, 85);
        assertEquals(expected, actual);
    }
}
