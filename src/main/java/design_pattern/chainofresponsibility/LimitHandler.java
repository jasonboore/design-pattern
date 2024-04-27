package design_pattern.chainofresponsibility;

public class LimitHandler extends Handler{
    private int limit;
    public LimitHandler(String name, int limit) {
        super(name);
        this.limit = limit;
    }
    @Override
    public boolean handle(Problem problem) {
        if (problem.getNumber() < limit) {
            return true;
        }
        return false;
    }
}
