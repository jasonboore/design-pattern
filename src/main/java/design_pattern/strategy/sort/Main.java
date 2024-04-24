package design_pattern.strategy.sort;

public class Main {
    public static void main(String[] args) {
        String[] data = {"D", "B", "A", "C", "E"};
        String[] d1 = {"D", "B", "A", "C", "E"};
        SortAndPrint sortAndPrint = new SortAndPrint(data, new SelectionSorter());
        sortAndPrint.execute();
        System.out.println("---------------");
        SortAndPrint s1 = new SortAndPrint(d1, new ArraysSorter());
        s1.execute();

    }
}
