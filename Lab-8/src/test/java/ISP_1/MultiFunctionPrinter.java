package ISP_1;

public class MultiFunctionPrinter implements IScanner,IAbstractPrinter,IFaxService{

    public void print(Document document) {
        System.out.println("Printing "+ document.text);
    }

    public void fax(Document document) {
        System.out.println("Printing "+document.text);
    }

    public Document scan(Document document) {
        return document;
    }
}
