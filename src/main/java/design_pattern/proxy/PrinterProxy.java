package design_pattern.proxy;

public class PrinterProxy implements Printable{
    private String name;
    private Printable real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String content) {
        realize();
        real.print(content);
    }

    public synchronized void realize() {
        if (real == null) {
            real = new Printer(this.name);
        }
    }
}
