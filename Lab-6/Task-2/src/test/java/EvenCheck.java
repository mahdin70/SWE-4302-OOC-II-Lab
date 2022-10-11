import java.util.ArrayList;

public class EvenCheck implements Property<Integer>{
    @Override
    public boolean test(Integer obj) {
        return obj%2==0;
    }
}
