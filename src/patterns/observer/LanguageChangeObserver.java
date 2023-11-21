package patterns.observer;

public class LanguageChangeObserver implements LanguageObserver {
    private String bookTitle;

    public LanguageChangeObserver(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void updateLanguage(String newLanguage) {
        System.out.println("Language of " + bookTitle + " changed to: " + newLanguage);
    }
}