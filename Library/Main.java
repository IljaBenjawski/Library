package Library;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        ArrayList<LibraryItem> library = new ArrayList<>();
        library.add(new Book(1, "Java Programming Basics", 2005, "Shelf A", "Programming, Java", false, "Author1", true, "Publisher1"));
        library.add(new Book(2, "Advanced Java", 2010, "Shelf B", "Programming, Java", false, "Author2", true, "Publisher2"));
        library.add(new Movie(3, "Java: The Movie", 2015, "Streaming", "Drama", false, "Director1"));
        library.add(new Book(4, "Python for Beginners", 2020, "Shelf C", "Programming, Python", false, "Author3", true, "Publisher3"));

    Scanner scanner = new Scanner(System.in);

        System.out.println("Search for: ");
    String input = scanner.nextLine();
    while(!input.equals("exit")){
        ArrayList<LibraryItem>result = new ArrayList<>();
        for(LibraryItem item : library){
            if(input.contains("any")){
                String search = input.split("any")[1].trim();
                if(item.getFullObject().toLowerCase().contains(search.toLowerCase())){
                    result.add(item);
                    System.out.println(result);
                }
            }
            else if(input.contains("book") || input.contains("magazine") || input.contains("newspaper") || input.contains("movie")){
                System.out.println("buch");
            }
        }
    }

    }
}
