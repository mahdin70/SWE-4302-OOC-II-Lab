package PreviousLabs.Lab5.Task3;

import java.util.ArrayList;

public class Printer<T> {
    public <T extends Person> String printList(ArrayList<T> list) {
        String s = "";
        for (T t : list) {
            s = s + t.name + " " + t.age + " " + t.address;
        }
        return s;
    }
}
