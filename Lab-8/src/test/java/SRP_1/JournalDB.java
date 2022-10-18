package SRP_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JournalDB {
    Map<String, List<String>> repo;

    public void save(String string, List<String> list){
        repo.put(string, list);
    }

    public List<String> load(String string){
        return repo.get(string);
    }

}
