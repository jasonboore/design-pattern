package design_pattern.strategy.sort;

import java.util.Arrays;

public class ArraysSorter implements Sorter{
    @Override
    public void sort(Comparable[] data) {
        Arrays.sort(data);
    }
}
