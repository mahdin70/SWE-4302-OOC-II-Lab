package Assignment2.StampCoupling;

public class ArrayA {
    private int[] array = {1,2,3,4,5};
    ArrayB b = new ArrayB();
    ArrayC c = new ArrayC();
    public void start(){
        b.callB(array,c);
    }
}
