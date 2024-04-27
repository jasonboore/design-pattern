package design_pattern.chainofresponsibility;

public abstract class Handler {
    private String name;
    private Handler next;

    public Handler(String name) {
        this.name = name;
    }

    public Handler setNext(Handler handler) {
        this.next = handler;
        return next;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public abstract boolean handle(Problem problem);

    public final void support(Problem problem) {
        if (handle(problem)) {
            done(problem);
        }
//        if (next != null) {
//            next.support(problem);
//        } else {
//            fail(problem);
//        }
    }

    private void fail(Problem problem) {
        System.out.println(problem + " cannot be handled.");
    }

    protected void done(Problem problem) {
        System.out.println(problem + " is handled by " + this + ".");
    }

    @Override
    public String toString() {
        return "[" + this.name + "]";
    }

    protected Handler getNext() {
        return next;
    }
}
