package Library;

public class Book extends LibraryItem {

    protected String author;
    protected boolean ebookYesNo;
    protected String publisher;

    public Book(int id, String title, int year, String shelf,String tags, boolean checked_out, String author, boolean ebookYesNo, String publisher){
        super( id,  title,  year,  shelf,  tags,checked_out);
        this.author=author;
        this.ebookYesNo=ebookYesNo;
        this.publisher=publisher;
    }

    protected String getAuthor(){
        return author;
    }

    protected String getBookFromat() {
        return ebookYesNo ? "Ebook" : "Physical";
    }

    protected String getPublisher(){
        return publisher;
    }

    @Override
    protected String getFullObject(){
        return "ID: "+id+" Title: "+title+" Author: "+author+" Year: "+year+ "Shelf: "+shelf+" Availabel: "+checked_out;
    }

    protected String getType(){
        return "book";
    }
}
