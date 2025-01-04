package Library;

public abstract class LibraryItem {
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
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getShelf() {
        return shelf;
    }

    public String getTags() {
        return tags;
    }

    public boolean isCheckedOut() {
        return checked_out;
    }

    public void setCheckedOut(boolean checkedOut) {
        checked_out = checkedOut;
    }

    protected abstract String getType();
    protected abstract String getFullObject();

}


