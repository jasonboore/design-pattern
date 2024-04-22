package design_pattern.iterator;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(4);
        bookshelf.appendBook(new Book("A"))
                .appendBook(new Book("B"))
                .appendBook(new Book("C"))
                .appendBook(new Book("D"))
                .appendBook(new Book("E"));
        Iterator iterator = bookshelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
