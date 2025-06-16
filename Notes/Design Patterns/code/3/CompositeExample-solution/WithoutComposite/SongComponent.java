package WithoutComposite;

public abstract class SongComponent {
    // Add components
    abstract void add(Song newSong) ;
    // Remove components
    abstract void remove(Song newSong);
    // Get component
    abstract Song getSong(int songIndex);
    // Retrieve song names
    abstract String getSongName();
    // Retrieve band names
    abstract String getBandName();
    // Retrieve release year
    abstract int getReleaseYear();
    // When this is called by a class object
    // that extends SongComponent it will
    // print out information specific to the
    // Song or SongGroup
    abstract void displaySongInfo();
}

