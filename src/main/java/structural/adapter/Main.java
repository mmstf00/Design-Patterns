package structural.adapter;

/**
 * We'll create an example with a media player that can play different types of media files,
 * such as MP3 and MP4. However, we want to introduce a new media type, VLC, and we'll use the
 * Adapter pattern to make the VLC player compatible with the existing media player interface.
 */
public class Main {
    public static void main(String[] args) {
        MediaPlayer mp3Player = new MP3Player();
        MediaPlayer mp4Player = new MP4Player();

        // Using the existing media players
        mp3Player.play("song.mp3");
        mp4Player.play("video.mp4");

        // Introducing the VLC player through the adapter
        VLCPlayer vlcPlayer = new VLCPlayer();
        MediaPlayer vlcPlayerAdapter = new VLCPlayerAdapter(vlcPlayer);
        vlcPlayerAdapter.play("movie.vlc");
    }
}
