package adapter;


public class VLCPlayer implements AdvancedMediaPlayer {
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file : " + fileName);
    }


    public void playMP4(String fileName) {}
}
