package Library;
import java.util.Scanner;

public class Movie extends LibraryItem{
    protected String director;
    protected String device;

    public Movie(int id, String title, int year, String shelf,String tags, boolean checked_out, String director){
        super( id,  title,  year,  shelf,  tags,checked_out );
        this.director = director;

    }

    public static void checkOption(int option){
        if(option < 1 || option > 4){
            throw new IllegalArgumentException("Number has to be between 1 and 4");
        }
    }
    // User kann sich sein Device aussuchen
    protected String getStreaming_device(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose:\nDVD: 1\nBlue Ray: 2\nCD: 3\nOnline Streaming 4\nUser Input: ");
        int option = scanner.nextInt();
        scanner.close();
        // es soll eine Zahl zwischen 1und 4 sein, sonst kommt eine Fehlermeldung
        try{
            checkOption(option);
        }
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());}

            switch (option){
                case 1:
                    return "DVD";

                case 2:
                     return  "Blue_Ray";

                case 3:
                    return "CD";

                case 4:
                    return "Online Streaming";

                default:
                     return "Something went wrong";
            }
    }

    @Override
    protected String getFullObject(){
        return "ID: "+id+", Title: "+title+", Director: "+director+", Year: "+year+ ", Shelf: "+shelf+", Availabel: "+checked_out;
    }
    protected String getType(){
        return "movie";
    }
    }


