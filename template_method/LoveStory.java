package template_method;

/**
 * Created by artemis on 7/3/17.
 */
public class LoveStory extends Story {

    void beginning(){
        System.out.println("LoveStory::Boy and Girl meet!");
    }


    void conflict(){
        System.out.println("LoveStory::Boy and Girl can't be together for some reason.");
    }


    void end(){
        System.out.println("LoveStory::Boy and Girl are reunited and live happily ever after!");
    }
}
