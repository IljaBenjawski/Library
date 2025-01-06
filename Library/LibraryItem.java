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
    protected String checker(){
        return checked_out ? "yes" : "not";
    }

    public int getId() {
        return id;
    }

    public void checkOut() {
        if (!checked_out) {
            System.out.println("Item " + id + " checked out successfully.");
            checked_out = true;
        } else {
            System.out.println("Item " + id + " is already checked out.");
        }
    }

    public void returnItem() {
        if (checked_out) {
            System.out.println("Item " + id + " returned successfully.");
            checked_out = false;
        } else {
            System.out.println("Item " + id + " was not checked out.");
        }
    }


    protected abstract String getType();
    protected abstract String getFullObject();

}


