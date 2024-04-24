package design_pattern.builder;

import java.util.ArrayList;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午 ");
        builder.makeItems(new ArrayList<String>() {{
            add("早上好。");
            add("下午好。");
        }});
        builder.makeTitle("晚上 ");
        builder.makeItems(new ArrayList<String>() {{
            add("晚上好。");
            add("晚安。");
            add("再见。");
        }});
        builder.close();
    }
}
