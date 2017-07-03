package template_method;

/**
 * Created by artemis on 7/3/17.
 */
public class MysteryStory extends Story {

    void beginning(){
        System.out.println("MysteryStory::Someone is murdered!");
    }


    void conflict(){
        System.out.println("MysteryStory::The police tries to find the killer!");
    }


    void end(){
        System.out.println("MysteryStory::The police find the killer just before he kills again!");
    }
}