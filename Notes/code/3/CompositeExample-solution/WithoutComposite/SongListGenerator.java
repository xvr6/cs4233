package WithoutComposite;

public class SongListGenerator {

    public static void main(String[] args){

        SongComponent industrialMusic = new SongGroup("Industrial",
                "is a style of experimental music with provocative themes");
        SongComponent heavyMetalMusic = new SongGroup("\nHeavy Metal",
                "is a genre of rock that developed in the late 1960s");
        SongComponent dubstepMusic = new SongGroup("\nDubstep",
                "is a genre of electronic dance music");

        SongComponent everySong = new SongGroup("Song List","All Songs");
        //everySong.add(industrialMusic); // Can't add SongGroups to other SongGroups

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
        //industrialMusic.add(dubstepMusic); // Can't add SongGroups to other SongGroups

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));
        everySong.add(new Song("Hello", "Adele", 2015));

        //everySong.add(heavyMetalMusic); // Can't add SongGroups to other SongGroups
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        everySong.displaySongInfo();
        heavyMetalMusic.displaySongInfo();
        industrialMusic.displaySongInfo();
        dubstepMusic.displaySongInfo();
    }

}

