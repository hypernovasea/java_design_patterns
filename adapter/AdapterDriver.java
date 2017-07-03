package adapter;

/**
 * Drives the adapter design pattern program.
 *
 * The Adapter design pattern is a STRUCTURAL design pattern which
 * converts the interface of a class to an interface that clients
 * expects.
 *
 * In this example, we have a regular media player and an advanced
 * media player. The audio player implements the media player interface
 * and the vlc and mp4 media player implements the advanced media player
 * interface. Since the audio player cannot play vlc / mp4 files since
 * its interface does not allow it, a media adapter has been created in
 * the audio player class. The media adapter implements the media player
 * interface but it creates an advanced media player that is instantiated
 * depending on the vlc / mp4 format given.
 */
public class AdapterDriver {

    public static void main(String[] args) {

        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "Demons by Fatboy Slim");
        player.play("mp4", "Jusfayu by KAMAU");
    }
}
