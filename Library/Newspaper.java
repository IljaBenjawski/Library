package Library;

public class Newspaper extends LibraryItem{

    protected String publicationDate;

    public Newspaper(int id, String title, int year, String shelf,String tags, boolean checked_out){
        super( id,  title,  year,  shelf,  tags,checked_out);
    }

    protected String getCheckout() {
        return checked_out ? "Not Available" : "Available";
    }

    @Override
    protected String getFullObject() {
        return "ID: " + id + " | " +
                "Title: " + title + " | " +
                "Year: " + year + " | " +
                "Shelf: " + shelf + " | " +
                "Available: " + getCheckout();
    }

    protected String getType(){
        return "newspaper";
    }

}
