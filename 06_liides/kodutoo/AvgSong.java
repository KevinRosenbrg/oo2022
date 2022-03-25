package kodutoo;

public class AvgSong extends SongInfo implements SongObject{
    public AvgSong(String song, String artist, double words, double duration, double avgWordsPerMin) {
        super(song, artist, words, duration, avgWordsPerMin);
    }

    @Override
    public double calcSingTime() { // calculate singing time in seconds
        return (words / avgWordsPerMin) * 60;
    }

    @Override
    public String calcSingPercent() { // calculate percent spent singing of the entire song duration
        int calculate = (int) Math.round((calcSingTime() * 100) / duration);
        return calculate + "% of the song is spent singing";
    }

    @Override
    public void songBy() { // add song and artist
        System.out.println(song + " by " + artist);
    }
}
