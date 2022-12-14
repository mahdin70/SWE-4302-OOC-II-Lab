package PreviousLabs.Lab8.Task1_ISP;

public class BasicPrinter implements IPrinter {
    @Override
    public void print(Document document) {
        System.out.println(document.text);
    }
}

