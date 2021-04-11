package question1;

import java.util.ArrayList;

public class SongGroup extends SongComponent {

    public ArrayList<SongComponent> songComponents = new ArrayList();

    public SongGroup(String genre, String description){

    }

    public int size(){
        return this.songComponents.size();
    }

    @Override
    public void add(SongComponent newSongComponent) {
        this.songComponents.add(newSongComponent);
        super.add(newSongComponent);
    }
}
