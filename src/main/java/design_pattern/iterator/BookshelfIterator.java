package design_pattern.iterator;

public class BookshelfIterator implements Iterator {
    private Bookshelf bookshelf;
    private int idx;

    public BookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx < bookshelf.getLength();
    }

    @Override
    public Object next() {
        return bookshelf.getBookAt(idx++);
    }
}
