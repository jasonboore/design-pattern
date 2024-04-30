package design_pattern.proxy;

public class Printer implements Printable{
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String content) {
        System.out.println("==========" + this.name + "===========");
        System.out.println(content);
    }
}
