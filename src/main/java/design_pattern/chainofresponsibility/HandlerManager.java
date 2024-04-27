package design_pattern.chainofresponsibility;

public class HandlerManager extends Handler {
    private Handler handler;

    public HandlerManager(String name) {
        super(name);
    }

    @Override
    public boolean handle(Problem problem) {
        done(problem);
        handler = this;
        while (handler.hasNext()) {
            handler = handler.getNext();
            handler.support(problem);
        }
        System.out.println("--------------------");
        return true;
    }
}
