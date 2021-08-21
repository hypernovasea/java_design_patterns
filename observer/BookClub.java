package observer;

import java.util.ArrayList;
public class BookClub implements AdventureSubject, HumorSubject, SciFiSubject, RomanceSubject {

    private ArrayList<Observer> adventurers;
    private ArrayList<Observer> comedians;
    private ArrayList<Observer> nerds;
    private ArrayList<Observer> romantics;

    private String new_adventure;
    private String new_humor;
    private String new_scifi;
    private String new_romance;


    public BookClub() {
        System.out.println("Starting a new book club...");
        adventurers = new ArrayList<Observer>();
        comedians = new ArrayList<Observer>();
        nerds = new ArrayList<Observer>();
        romantics = new ArrayList<Observer>();
    }


    public void registerAdventurer(Observer o) {
        adventurers.add(o);
    }


    public void removeAdventurer(Observer o) {
        adventurers.remove(o);
        System.out.println("Removed an adventurer.");
    }


    public void notifyAdventurers() {
        System.out.println("New : A daring and crazy journey...");
        for (Observer observer : adventurers) {
            observer.update(new_adventure);
        }
    }


    public void setNewAdventure(String title)
    {
        System.out.println("New adventure title : " + title);
        new_adventure = title;
        notifyAdventurers();
    }


    public void registerComedian(Observer o)
    {
        comedians.add(o);
    }


    public void removeComedian(Observer o)
    {
        comedians.remove(o);
        System.out.println("Removed a comedian.");
    }


    public void notifyComedians()
    {
        System.out.println("Just in today, a laugh out loud knee slapper...");
        for(Observer observer : comedians){
            observer.update(new_humor);
        }
    }


    public void setNewHumor(String title)
    {
        System.out.println("New humor title : " + title);
        new_humor = title;
        notifyComedians();
    }


    public void registerNerd(Observer o)
    {
        nerds.add(o);
    }


    public void removeNerd(Observer o)
    {
        nerds.remove(o);
        System.out.println("Removed a nerd.");
    }


    public void notifyNerds()
    {
        System.out.println("A dazzling and thrilling phenomenon this just in");
        for(Observer observer : nerds){
            observer.update(new_scifi);
        }
    }


    public void setNewSciFi(String title)
    {
        System.out.println("New sci-fi title : " + title);
        new_scifi = title;
        notifyNerds();
    }


    public void registerRomantic(Observer o)
    {
        romantics.add(o);
    }


    public void removeRomantic(Observer o)
    {
        romantics.remove(o);
        System.out.println("Removed a romantic");
    }


    public void notifyRomantics()
    {
        System.out.println("A new slow-burning romance that sizzles...");
        for(Observer observer : romantics){
            observer.update(new_romance);
        }
    }


    public void setNewRomance(String title)
    {
        System.out.println("New romance title : " + title);
        new_romance = title;
        notifyRomantics();
    }



}
