package observer;

/**
 * Driver program for the observer pattern.
 *
 * The observer design pattern is a BEHAVIORAL pattern that defines a 1-to-many relationship
 * between objects in which when one object (the subject) changes state all of its dependents
 * are notified and updated automatically. The observers are loosely coupled in that the
 * subject knows nothing about them.
 *
 * In this example, there is a book club that sends out updates to its reading list
 * depending on who has signed up for what.
 */
public class ObserverDriver
{

    public static void main(String[] args)
    {

        BookClub club = new BookClub();

        Observer a = new Adventurer(club, "Angie");
        Observer b = new Adventurer(club, "Brad");
        Observer c = new Adventurer(club, "Charlie");
        Observer d = new Comedian(club, "Daryl");
        Observer e = new Comedian(club, "Eric");
        Observer f = new Nerd(club, "Freddie");
        Observer g = new Nerd(club, "George");
        Observer h = new Nerd(club, "Hal");
        Observer i = new Nerd(club, "Imogen");
        Observer j = new Nerd(club, "Jay");
        Observer k = new Romantic(club, "Kiki");
        Observer l = new Romantic(club, "Larry");

        club.setNewAdventure("Jurassic Park");
        club.setNewHumor("This Guy");

        System.out.println(d.getName() + " is reading " + d.getCurrentBook());
        System.out.println(g.getName() + " is reading " + g.getCurrentBook());

        club.setNewRomance("Bridget Jones's Diary");
        club.setNewSciFi("2001: A Space Odyssey");

        System.out.println(g.getName() + " is reading " + g.getCurrentBook());
        System.out.println(l.getName() + " is reading " + l.getCurrentBook());

        club.setNewHumor("Modern Love");

        System.out.println(d.getName() + " is reading " + d.getCurrentBook());
        System.out.println(e.getName() + " is reading " + e.getCurrentBook());

        club.removeComedian(d);
        d = new Romantic(club, "Daryl");
        System.out.println(d.getName() + " is reading " + d.getCurrentBook());
        club.setNewRomance("Bridget Jones's Diary II");
        System.out.println(d.getName() + " is reading " + d.getCurrentBook());

    }
}
