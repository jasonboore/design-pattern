package design_pattern.proxy;

public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String content);
}
