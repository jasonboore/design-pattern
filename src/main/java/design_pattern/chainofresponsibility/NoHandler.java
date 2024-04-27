package design_pattern.chainofresponsibility;

public class NoHandler extends Handler{
    public NoHandler(String name) {
        super(name);
    }

    @Override
    public boolean handle(Problem problem) {
        return false;
    }
}
