package PreviousLabs.Lab8.Task1_ISP;

public class MultiPrinter implements IPrinter, IScan, IFax {
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.text);
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document.text);
    }

    @Override
    public void fax(Document document) {
        System.out.println("Faxing document: " + document.text);
    }
}

