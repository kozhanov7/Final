package patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private static Book instance;
    private String title;
    private patterns.strategy.LanguageStrategy languageStrategy;
    private List<patterns.decorator.BookDecorator> decorators;
    private List<patterns.observer.LanguageObserver> observers;

    private Book(String title, patterns.strategy.LanguageStrategy languageStrategy) {
        this.title = title;
        this.languageStrategy = languageStrategy;
        this.decorators = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public static Book getInstance(String title, patterns.strategy.LanguageStrategy languageStrategy) {
        if (instance == null) {
            instance = new Book(title, languageStrategy);
        }
        return instance;
    }

    public static Book createBook(String title, patterns.strategy.LanguageStrategy languageStrategy) {
        return new Book(title, languageStrategy);
    }

    public void addDecorator(patterns.decorator.BookDecorator decorator) {
        decorators.add(decorator);
    }

    public void addObserver(patterns.observer.LanguageObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(patterns.observer.LanguageObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        String newLanguage = languageStrategy.calculateLanguage();
        for (patterns.observer.LanguageObserver observer : observers) {
            observer.updateLanguage(newLanguage);
        }
    }

    public void setLanguageStrategy(patterns.strategy.LanguageStrategy languageStrategy) {
        this.languageStrategy = languageStrategy;
        notifyObservers(); // Notify observers when language changes
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        StringBuilder languageInfo = new StringBuilder(languageStrategy.calculateLanguage());

        for (patterns.decorator.BookDecorator decorator : decorators) {
            languageInfo.append(", ").append(decorator.addFeature());
        }

        return languageInfo.toString();
    }
}
