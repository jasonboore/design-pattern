package design_pattern.chainofresponsibility;

public class OddHandler extends Handler {
    public OddHandler(String name) {
        super(name);
    }

    @Override
    public boolean handle(Problem problem) {
        if ((problem.getNumber() & 1) == 1) {
            return true;
        }
        return false;
    }
}
