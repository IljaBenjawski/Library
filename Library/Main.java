package Library;

public class Main {
    public static void main(String[] args) {
        // Beispiel für die Erstellung eines Movies
        Book movie = new Book(12, "The Matrix", 1999, "Shelf A", "Sci-Fi, Action", false, "hu", true, "hjk");

        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Is Checked Out: " + movie.isCheckedOut());
        System.out.println( movie.getBookFromat());

    }
}
