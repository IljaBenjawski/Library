package Library;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem{
    public static void main(String[] args) {

        ArrayList<LibraryItem> library = new ArrayList<>();

        library.add(new Book(1, "Java Programming Basics", 2005, "Shelf A", "Programming, Java", false, "Author1", true, "Publisher1"));
        library.add(new Book(2, "Advanced Python", 2010, "Shelf B", "Programming, Python", false, "Author2", true, "Publisher2"));

        library.add(new Movie(3, "Java: The Movie", 2015, "Streaming A", "Drama", false, "Director1", "DVD"));
        library.add(new Movie(4, "Advanced Movie", 2018, "Streaming B", "Action", true, "Director2", "Online Streaming"));

        library.add(new Newspaper(5, "Python for Beginners", 2020, "Shelf C", "Programming, Python", false));
        library.add(new Newspaper(6, "Tech Daily", 2024, "Shelf D", "Technology", true));

        library.add(new Magazine(7, "Tech Monthly", 2021, "Shelf E", "Technology", false, "Editor1"));
        library.add(new Magazine(8, "Science Weekly", 2022, "Shelf F", "Science", true, "Editor2"));

        Scanner scanner = new Scanner(System.in);

         boolean condition = true;

        while (true){
            System.out.println("\nLibrary Item Menu");
            System.out.println("1. View Item Details");
            System.out.println("2. Check Out Item");
            System.out.println("3. Return Item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    while (condition) {
                        System.out.print("\nHow to search:\nsearch (example: 'search book java' or 'search any java')\nor type quit to go back to the menu: ");
                        String input = scanner.nextLine().trim();

                        if (input.equalsIgnoreCase("quit")) {
                            condition = false;
                        } else {
                            ArrayList<LibraryItem> result = new ArrayList<>();
                            String cleanInput = input.replace("search", "").trim().toLowerCase();

                            if (input.contains("any")) {
                                for (LibraryItem item : library) {
                                    if (item.getFullObject().toLowerCase().contains(cleanInput.replace("any", "").trim())) {
                                        result.add(item);
                                    }
                                }
                            }
                            else {
                                if (input.contains("book")) {
                                    for (LibraryItem item : library) {
                                        if (item instanceof Book && item.getFullObject().toLowerCase().contains(cleanInput.replace("book", "").trim())) {
                                            result.add(item);
                                        }
                                    }
                                } else if (input.contains("movie")) {
                                    for (LibraryItem item : library) {
                                        if (item instanceof Movie && item.getFullObject().toLowerCase().contains(cleanInput.replace("movie","").trim())) {
                                            result.add(item);
                                        }
                                    }
                                } else if (input.contains("magazine")) {
                                    for (LibraryItem item : library) {
                                        if (item instanceof Magazine && item.getFullObject().toLowerCase().contains(cleanInput.replace("magazine","").trim())) {
                                            result.add(item);
                                        }
                                    }
                                } else if (input.contains("newspaper")) {
                                    for (LibraryItem item : library) {
                                        if (item instanceof Newspaper && item.getFullObject().toLowerCase().contains(cleanInput.replace("newspaper","").trim())) {
                                            result.add(item);
                                        }
                                    }
                                }
                            }

                            if (result.isEmpty()) {
                                System.out.println("Nothing was found");
                            } else {
                                for (LibraryItem item : result) {
                                    System.out.println(item.getFullObject());
                                }
                            }
                        }


                    }


                    break;
                case "2":
                    System.out.print("Type in the ID: ");
                    int checkID = scanner.nextInt();
                    scanner.nextLine();
                    boolean foundCheck = false;

                    for (LibraryItem item : library) {
                        if (item.getId() == checkID) {
                            item.checkOut();
                            foundCheck = true;
                            break;
                        }
                    }
                    if (!foundCheck) {
                        System.out.println("Item with ID " + checkID + " not found.");
                    }
                    break;

                case "3":
                    System.out.print("Type in the ID: ");
                    int returnId = scanner.nextInt();
                    scanner.nextLine();
                    boolean foundReturn = false;

                    for (LibraryItem item : library) {
                        if (item.getId() == returnId) {
                            item.returnItem();
                            foundReturn = true;
                            break;
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Item with ID " + returnId + " not found.");
                    }
                    break;

                case "4":
                case "exit":
                    System.out.println("Thank you bye bye");
                    return;
                default:
                    System.out.println("A problem occured");
                    break;
            }

    }



    }
}
