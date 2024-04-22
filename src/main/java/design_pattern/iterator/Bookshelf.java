package design_pattern.iterator;


import java.util.ArrayList;
import java.util.List;

public class Bookshelf implements Aggregate{
    List<Book> books;

    public Bookshelf(int maxSize) {
        books = new ArrayList<>(maxSize);
    }

    public Book getBookAt(int idx) {
        return books.get(idx);
    }

    public Bookshelf appendBook(Book book) {
        books.add(book);
        return this;
    }

    public int getLength() {
        return this.books.size();
    }



    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }
}
