import java.util.ArrayList;
public class Printer {
    <T extends Person> String printList(ArrayList<T> list) {
        StringBuilder s = new StringBuilder();
        for (T e : list) {
            s.append(e.toString()).append('\n');
        }
        return s.toString();
    }
}
