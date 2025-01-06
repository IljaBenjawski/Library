package Library;

public class Newspaper extends LibraryItem{

    protected String publicationDate;

    public Newspaper(int id, String title, int year, String shelf,String tags, boolean checked_out){
        super( id,  title,  year,  shelf,  tags,checked_out);
    }

    @Override
    protected String getFullObject() {
        return "ID: " + id + " | " +
                "Title: " + title + " | " +
                "Year: " + year + " | " +
                "Shelf: " + shelf + " | " +
                "Available: " + checker();
    }

    protected String getType(){
        return "newspaper";
    }

}
