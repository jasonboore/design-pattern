package design_pattern.template;


public abstract class AbstractDisplay {
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();
}
