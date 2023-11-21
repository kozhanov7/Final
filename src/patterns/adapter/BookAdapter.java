package patterns.adapter;

public class BookAdapter implements LegacyLibrarySystem {
    private patterns.singleton.Book book;

    public BookAdapter(patterns.singleton.Book book) {
        this.book = book;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Adapter: " + book.getTitle() + ", " + book.getLanguage());
    }
}