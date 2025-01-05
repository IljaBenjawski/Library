package Library;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        ArrayList<LibraryItem> library = new ArrayList<>();

        library.add(new Book(1, "Java Programming Basics", 2005, "Shelf A", "Programming, Java", false, "Author1", true, "Publisher1"));
        library.add(new Book(2, "Advanced Java", 2010, "Shelf B", "Programming, Java", false, "Author2", true, "Publisher2"));

        library.add(new Movie(3, "Java: The Movie", 2015, "Streaming", "Drama", false, "Director1"));
        library.add(new Movie(4, "Advanced Movie", 2018, "Blu-Ray", "Action", false, "Director2"));

        library.add(new Newspaper(5, "Python for Beginners", 2020, "Shelf C", "Programming, Python", false));
        library.add(new Newspaper(6, "Tech Daily", 2024, "Shelf D", "Technology", true));

        library.add(new Magazine(7, "Tech Monthly", 2021, "Shelf E", "Technology", false, "Editor1"));
        library.add(new Magazine(8, "Science Weekly", 2022, "Shelf F", "Science", true, "Editor2"));

    Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Search (example: 'search book java' or 'search any java'): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            ArrayList<LibraryItem> result = new ArrayList<>();

        for(LibraryItem item : library) {
            if (input.contains("any")) {
                String cleanInput = input.replaceAll("any|search", "").trim().toLowerCase();
                if (item.getFullObject().toLowerCase().contains(cleanInput)) {
                    result.add(item);
                }
            } else if (input.contains("book") || item instanceof Book) {
                String cleanInput = input.replace("search", "").replace("book", "").trim().toLowerCase();
                if (item.getFullObject().toLowerCase().contains(cleanInput)) {
                    result.add(item);
                }
            } else if (input.contains("movie") || item instanceof Movie) {
                String cleanInput = input.replace("search", "").replace("movie", "").trim().toLowerCase();
                if (item.getFullObject().toLowerCase().contains(cleanInput)) {
                    result.add(item);
                }
            } else if (input.contains("magazine") || item instanceof Magazine) {
                String cleanInput = input.replace("search", "").replace("magazine", "").trim().toLowerCase();
                if (item.getFullObject().toLowerCase().contains(cleanInput)) {
                    result.add(item);
                }
            } else if (input.contains("newspaper") || item instanceof Newspaper) {
                String cleanInput = input.replace("search", "").replace("newspaper", "").trim().toLowerCase();
                if (item.getFullObject().toLowerCase().contains(cleanInput)) {
                    result.add(item);
                }
            }
        }
        if(result.isEmpty()){
            System.out.println("Nothing was found");
        }else{
            for(LibraryItem item : result){
                System.out.println(item.getFullObject());
            }
        }

    }

    scanner.close();

    }
}
