package WithComposite;

public abstract class SongComponent {
    // Add components
    abstract void add(SongComponent newSongComponent) ;
    // Remove components
    abstract void remove(SongComponent newSongComponent);
    // Get component
    abstract SongComponent getComponent(int componentIndex);
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

