package design_pattern.singleton;

public class TripleTest {
    public static void main(String[] args) {
        Triple t1 = Triple.getInstance(0);
        Triple t2 = Triple.getInstance(1);
        Triple t3 = Triple.getInstance(2);
        Triple t4 = Triple.getInstance(4);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
