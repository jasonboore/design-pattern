package design_pattern.builder;

import java.util.List;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();
    @Override
    public void makeTitle(String title) {
        buffer.append("===================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('·' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(List<String> items) {
        items.forEach(item -> buffer.append(" ·" + item + "\n"));
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
