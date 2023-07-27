package structural.adapter;

public class VLCPlayerAdapter implements MediaPlayer {
    private final VLCPlayer vlcPlayer;

    public VLCPlayerAdapter(VLCPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String filename) {
        // Adapt the VLCPlayer method to the MediaPlayer interface
        vlcPlayer.startPlayback(filename);
    }
}
