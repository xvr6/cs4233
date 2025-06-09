package WithoutComposite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
    ArrayList <Song> songs = new <Song>  ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription){
        groupName = newGroupName;
        groupDescription = newGroupDescription;
    }
    
    public String getGroupName() { return groupName; }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(Song newSong) {
        songs.add(newSong);
    }
    public void remove(Song newSong){
        songs.remove(newSong);
    }
    public Song getSong(int songIndex) {
        return (Song)songs.get(songIndex);
    }

    public void displaySongInfo(){
        System.out.println(getGroupName()+" "+getGroupDescription());
        // Cycles through and prints any Songs or SongGroups added
        // to this SongGroups ArrayList songComponents
        Iterator songIterator = songs.iterator();
        while(songIterator.hasNext()) {
            SongComponent songInfo = (Song) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
    // raise an exception if a Song method is called
    String getSongName() { throw new UnsupportedOperationException("getSongName is not defined for SongGroup");}
    // Retrieve band names
    String getBandName(){ throw new UnsupportedOperationException("getBandName is not defined for SongGroup");} ;
    // Retrieve release year
    int getReleaseYear(){ throw new UnsupportedOperationException("getReleaseYear is not defined for SongGroup");} ;

}
