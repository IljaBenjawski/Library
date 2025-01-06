package Library;
public class Movie extends LibraryItem{
    protected String director;
    protected String device;

    public Movie(int id, String title, int year, String shelf,String tags, boolean checked_out, String director, String device){
        super( id,  title,  year,  shelf,  tags,checked_out );
        this.director = director;
        this.device =device;

    }


    @Override
    protected String getFullObject(){
        return "ID: "+ id + " | "+
                "Title: "+ title + " | " +
                "Director: "+ director + " | " +
                "Year: "+ year + " | " +
                "Shelf: "+ shelf + " | " +
                "Device: "+ device + " | " +
                "Availabel: "+checker();
    }
    protected String getType(){
        return "movie";
    }
    }


