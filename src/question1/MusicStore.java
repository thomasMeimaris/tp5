package question1;

public class MusicStore {

    public SongGroup songList;

    public SongGroup getSongList() {
        return songList;
    }

    public MusicStore(SongComponent songComponent){
        this.songList = (SongGroup) songComponent;
    }

}
