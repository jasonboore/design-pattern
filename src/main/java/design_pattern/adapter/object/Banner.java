package design_pattern.adapter.object;

public class Banner {
    protected String s;

    public Banner(String s) {
        this.s = s;
    }
    public void showWithParen() {
        System.out.println("(" + s + ")");
    }

    public void showWithAster() {
        System.out.println("*" + s + "*");
    }
}
