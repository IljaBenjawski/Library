package Library;

public class Magazine extends LibraryItem{
    protected String publisher;

    public Magazine(int id, String title, int year, String shelf,String tags, boolean checked_out, String publisher){
        super( id,  title,  year,  shelf,  tags, checked_out);
        this.publisher=publisher;
    }
    protected String getPublisher(){
        return publisher;
    }

    protected void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    @Override
    protected String getType(){
        return "Magazine";
    }
}
