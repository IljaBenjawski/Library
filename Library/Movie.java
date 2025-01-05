package Library;
import java.util.Scanner;
//DVD STREAMING Usw
public class Movie extends LibraryItem{
    protected String director;
    protected String device;

    public Movie(int id, String title, int year, String shelf,String tags, boolean checked_out, String director){
        super( id,  title,  year,  shelf,  tags,checked_out );
        this.director = director;

    }

    @Override
    protected String getFullObject(){
        return "ID: "+ id + " | "+
                "Title: "+ title + " | " +
                "Director: "+ director + " | " +
                "Year: "+ year + " | " +
                "Shelf: "+ shelf + " | " +
                "Availabel: "+checked_out;
    }
    protected String getType(){
        return "movie";
    }
    }


