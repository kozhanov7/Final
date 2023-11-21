package patterns.adapter;

public class LegacyLibrarySystemImpl implements LegacyLibrarySystem {
    private String bookInfo;

    public LegacyLibrarySystemImpl(String bookInfo) {
        this.bookInfo = bookInfo;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Legacy Library System: " + bookInfo);
    }
}


