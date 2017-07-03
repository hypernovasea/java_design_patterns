package adapter;

/**
 * Created by artemis on 7/2/17.
 */
public class VLCPlayer implements AdvancedMediaPlayer
{
    public void playVLC(String fileName)
    {
        System.out.println("Playing VLC file : " + fileName);
    }


    public void playMP4(String fileName)
    {}
}
