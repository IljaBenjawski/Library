package Library;

public class Movie extends LibraryItem{

    public Movie(int id, String title, int year, String shelf,String tags, boolean checked_out){
        super( id,  title,  year,  shelf,  tags,checked_out);
    }

}
