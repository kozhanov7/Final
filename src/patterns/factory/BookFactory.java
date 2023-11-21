package patterns.factory;

import patterns.strategy.LanguageStrategy;
import patterns.singleton.Book;

public class BookFactory {
    public static Book createBook(String title, LanguageStrategy languageStrategy) {
        return Book.createBook(title, languageStrategy);
    }
}
