package Library;

public class Newspaper extends LibraryItem{

    protected String publicationDate;

    public Newspaper(int id, String title, int year, String shelf,String tags, boolean checked_out, String publicationDate){
        super( id,  title,  year,  shelf,  tags,checked_out);
        this.publicationDate = publicationDate;
    }

    protected String getPublicationDate() {
        return publicationDate;
    }
    @Override
    protected String getFullObject(){
        return "ID: "+id+" Title: "+title+" Date of publication : "+publicationDate+" Year: "+year+ "Shelf: "+shelf+" Availabel: "+checked_out;
    }
    protected String getType(){
        return "newspaper";
    }

}
