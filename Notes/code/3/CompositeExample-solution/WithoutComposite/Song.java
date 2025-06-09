package WithoutComposite;

public class Song extends SongComponent {
    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongName,
                String newBandName,
                int newReleaseYear){
        songName = newSongName;
        bandName = newBandName;
        releaseYear = newReleaseYear;
    }

    public String getSongName() { return songName; }
    public String getBandName() { return bandName; }
    public int getReleaseYear() { return releaseYear; }

    public void displaySongInfo(){
        System.out.println("   *" + getSongName() + " was recorded by " +
                getBandName() + " in " + getReleaseYear());
    }
    // raise an exception if a SongGroup method is called
    void add(Song newSong) { throw new UnsupportedOperationException("add is not defined for Song");} ;
    // Remove components
    void remove(Song newSong){ throw new UnsupportedOperationException("remove is not defined for Song");} ;
    // Get component
    Song getSong(int songIndex){ throw new UnsupportedOperationException("getSong is not defined for Song");} ;
    // Retrieve song names


}
