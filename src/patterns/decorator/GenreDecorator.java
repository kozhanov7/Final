package patterns.decorator;

public class GenreDecorator implements BookDecorator {
    private String genre;

    public GenreDecorator(String genre) {
        this.genre = genre;
    }

    public String addFeature() {
        return "Genre: " + genre;
    }
}
