package design_pattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class HTMLBuilder implements Builder {
    private StringBuffer text = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        text.append("<html>\n");
        text.append("<head><title>" + title + "</title></head><body>\n");
        text.append("<h1>" + title + "</h1>\n");
    }

    @Override
    public void makeString(String str) {
        text.append("<p>" + str + "</p>\n");
    }

    @Override
    public void makeItems(List<String> items) {
        text.append("<ul>");
        for (int i = 0; i < items.size(); i++) {
            text.append("<li>" + items.get(i) + "</li>\n");
        }
        text.append("</ul>\n");
    }

    @Override
    public void close() {
        text.append("</body>\n");
        text.append("</html>");
    }

    public String getResult() {
        return text.toString();
    }

}