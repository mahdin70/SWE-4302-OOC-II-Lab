package PreviousLabs.Lab8.Task2_SRP1;

import java.util.List;

public class Journal {
    List<String> list;

    public void addEntries(List<String> list){
        this.list.addAll(list);
    }

    public void addEntry(String entry){
        this.list.add(entry);
    }

    public void removeEntry(String str){
        this.list.remove(str);
    }

    public String toString(){
        return list.toString();
    }
}
