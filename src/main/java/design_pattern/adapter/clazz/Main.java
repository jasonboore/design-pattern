package design_pattern.adapter.clazz;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printWeak();
        print.printStrong();

    }
}
