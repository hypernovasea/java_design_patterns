package bridge;

/**
 * Drives the bridge design pattern program.
 *
 * The Bridge design pattern is a STRUCTURAL design pattern which
 * decouples an abstraction from its implementation so that the
 * two can vary independently. This pattern decouples implementation
 * class and abstract class by providing a bridge structure between
 * them.
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



public class BridgeDriver {

    public static void main(String[] args){
        SuperpoweredBeing jeanGray = new JeanGray(new Genetics(), "Member of the X-Men");
        SuperpoweredBeing darthVader = new DarthVader(new TheForce(), "Powerful member of the Empire");
        SuperpoweredBeing willowRosenburg = new WillowRosenberg(new Magic(), "Powerful witch");

        jeanGray.move();
        darthVader.move();
        willowRosenburg.move();
    }
}
