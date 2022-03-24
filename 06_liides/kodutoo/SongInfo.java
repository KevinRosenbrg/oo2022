package kodutoo;

public abstract class SongInfo {
    String song;
    String artist;
    double duration;
    double words;
    double avgWordsPerMin;

    public SongInfo(String song, String artist, double words, double duration, double avgWordsPerMin){
        this.song = song;
        this.artist = artist;
        this.duration = duration;
        this.words = words;
        this.avgWordsPerMin = avgWordsPerMin;
    }
}
