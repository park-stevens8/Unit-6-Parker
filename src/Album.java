public class Album{
    private String title;
    private String artist;
    private int numTracks;
    private double playTime; //minutes


    public Album(String title, String artist, int tracks, double time){
        this.title = title;
        this.artist = artist;
        numTracks = tracks;
        playTime = time;
    }

    public String toString(){
        String result = "";
        result += title + "by " + artist + " | " + numTracks + " tracks";
        result += ", Time: " + playTime + " min";
        return result;
    }



}
