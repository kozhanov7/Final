import patterns.factory.BookFactory;
import patterns.observer.LanguageChangeObserver;
import patterns.observer.LanguageObserver;
import patterns.strategy.FrenchLanguageStrategy;
import patterns.strategy.SpanishLanguageStrategy;
import patterns.decorator.GenreDecorator;
import patterns.adapter.LegacyLibrarySystem;
import patterns.adapter.BookAdapter;

public class Main {
    public static void main(String[] args) {
        patterns.singleton.Book book = BookFactory.createBook("The Art of Programming", new FrenchLanguageStrategy());

        LanguageObserver observer1 = new LanguageChangeObserver("Observer1");
        LanguageObserver observer2 = new LanguageChangeObserver("Observer2");

        book.addObserver(observer1);
        book.addObserver(observer2);

        System.out.println(book.getTitle());
        System.out.println(book.getLanguage());

        book.setLanguageStrategy(new SpanishLanguageStrategy());

        patterns.decorator.BookDecorator genreDecorator = new GenreDecorator("Science");
        book.addDecorator(genreDecorator);

        System.out.println(book.getLanguage());

        LegacyLibrarySystem legacySystem = new BookAdapter(book);
        legacySystem.displayBookInfo();
    }
}
