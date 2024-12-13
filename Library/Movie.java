package Library;


public class Movie extends LibraryItem{

    // DVD, CD, Blue ray, Streaming
    protected String streaming_device;
    protected String director;
    public Movie(int id, String title, int year, String shelf,String tags, boolean checked_out, String streaming_device, String director){
        super( id,  title,  year,  shelf,  tags,checked_out );
        this.streaming_device=streaming_device;
        this.director = director;
    }
    protected String getStreaming_device(){
        return streaming_device;
    }
    @Override
    protected String getType(){
        return "Movie";
    }
    }


