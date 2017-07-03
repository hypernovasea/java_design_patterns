package adapter;

/**
 * Created by artemis on 7/2/17.
 */
public class MP4Player implements AdvancedMediaPlayer
{
    public void playMP4(String fileName)
    {
        System.out.println("Playing MP4 file : " + fileName);
    }


    public void playVLC(String fileName)
    {}
}
