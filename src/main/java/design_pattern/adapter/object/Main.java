package design_pattern.adapter.object;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner(new Banner("hello"));
        print.printWeak();
        print.printStrong();

    }
}
