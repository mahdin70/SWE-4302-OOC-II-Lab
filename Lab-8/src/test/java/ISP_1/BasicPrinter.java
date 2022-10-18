package ISP_1;
public class BasicPrinter implements IAbstractPrinter{
    @Override
    public void print(Document document) {
        System.out.println("Printing"+ document.text);
    }
}
