package design_pattern.builder;

import java.util.List;

public interface Builder {
    void makeTitle(String title);
    void makeString(String str);
    void makeItems(List<String> items);
    void close();
}
