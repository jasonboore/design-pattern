package design_pattern.template;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractDisplay> abstractDisplayList = new ArrayList<>();
        abstractDisplayList.add(new CharDisplay('H'));
        abstractDisplayList.add(new StringDisplay("Hello world!"));
        abstractDisplayList.add(new StringDisplay("你好!"));
        abstractDisplayList.forEach(AbstractDisplay::display);

    }
}
