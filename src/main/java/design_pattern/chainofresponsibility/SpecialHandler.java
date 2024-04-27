package design_pattern.chainofresponsibility;

public class SpecialHandler extends Handler{
    private int num;
    public SpecialHandler(String name, int limit) {
        super(name);
        this.num = limit;
    }
    @Override
    public boolean handle(Problem problem) {
        if (problem.getNumber() == num) {
            return true;
        }
        return false;
    }
}
