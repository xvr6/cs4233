package WithComposite;

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
    void add(SongComponent newSongComponent) { throw new UnsupportedOperationException("add is not defined for Song");} ;
    // Remove components
    void remove(SongComponent newSongComponent){ throw new UnsupportedOperationException("remove is not defined for Song");} ;
    // Get component
    SongComponent getComponent(int componentIndex){ throw new UnsupportedOperationException("getComponent is not defined for Song");} ;
}
