package Library;

public class LibraryItem {
    protected int id;
    protected String title;
    protected int year;
    protected String shelf;
    protected String tags;
    protected boolean checked_out;

    public LibraryItem( int id, String title, int year, String shelf, String tags, boolean checked_out){
        this.id =id;
        this.title=title;
        this.year=year;
        this.shelf=shelf;
        this.tags=tags;
        this.checked_out=checked_out;

       }
}
