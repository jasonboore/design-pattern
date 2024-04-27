package design_pattern.chainofresponsibility;

public class Problem {
    private int number;
    public Problem(int num) {
        this.number = num;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "[ Problem " + this.number + " ]";
    }
}
