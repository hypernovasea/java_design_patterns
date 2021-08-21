package adapter;

public class AudioPlayer implements MediaPlayer {
    
    MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file : " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            //bring out the media adapter
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
