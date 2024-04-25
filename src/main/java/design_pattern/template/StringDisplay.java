package design_pattern.template;

public class StringDisplay extends AbstractDisplay{
    private String str;
    private int width;

    public StringDisplay(String s) {
        this.str = s;
        this.width = this.str.getBytes().length;
    }
    @Override
    protected void open() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    protected void print() {
        System.out.println("| " + this.str + " |");
    }

    @Override
    protected void close() {
        printLine();
    }
}
