package adapter;

/**
 * Drives the adapter design pattern program.
 *
 * The Adapter design pattern is a STRUCTURAL design pattern which converts the interface of a class to an interface that clients expects.
 */
public class AdapterDriver {

    public static void main(String[] args) {

        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "Demons by Fatboy Slim");
        player.play("mp4", "Jusfayu by KAMAU");
    }
}
