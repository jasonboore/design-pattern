package design_pattern.builder;

public class Main {
 
	public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
        HTMLBuilder htmlbuilder = new HTMLBuilder();
        Director director1 = new Director(htmlbuilder);
        director1.construct();
        String filename = htmlbuilder.getResult();
        System.out.println(filename + "文件编写完成。");
	}
 
	private static void usage() {
		System.out.println("Usage: Java Main Plain");
		System.out.println("Usage: Java Main HTML");
	}
 
}