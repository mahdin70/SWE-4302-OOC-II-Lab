package PreviousLabs.Lab4;

public class Task1_ShamelessGreen {
    String s;
    public String verse(int verseNumber){
        switch (verseNumber){
            case 0:{
                String str;
                str = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.";
                return str;
            }

            case 1:{
                String str;
                str = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.";
                return str;
            }
            case 2:{
                String str;
                str = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.";
                return str;
            }
            default:{
                String str;
                str = verseNumber + " bottles of beer on the wall, " + verseNumber + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (verseNumber - 1) + " bottles of beer on the wall.";
                return str;
            }
        }
    }

    public String sing(int startVerse, int endVerse) {
        String str = "";
        for (int i = startVerse; i >= endVerse; i--) {
            str += verse(i);
        }
        return str;
    }
}
