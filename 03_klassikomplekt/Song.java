import java.util.Date;

public class Song {
    String name;
    String artist;
    int year;
    Date d=new Date();
    int curYear=d.getYear();

    public Song(String name, String artist, int year){
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public String toStrings() {
        return "Song details... " +
                "name: '" + name + '\'' +
                ", artist: '" + artist + '\'' +
                ", year: '" + year + '\'';
    }
    public String countYears() {
        int count = (curYear + 1900) - year;
        return "This song came out " + count + " years ago";
    }
}
