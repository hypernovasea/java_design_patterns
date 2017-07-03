package singleton;

/**
 * Drives the Singleton design pattern
 *
 * The Singleton design pattern is a CREATIONAL design pattern in which one
 * instance of a class is created and there is a global point of access to
 * it.
 *
 * In this example, there is only one Highlander. If the Highlander has been
 * created then the object will be passed as normal. Otherwise, if the
 * Highlander has not been created, the class will create it and pass it.
 */
public class HighlanderDriver {

    public static void main(String args[])
    {
        //illegal construct
        //Highlander highlander = new Highlander();

        //legal construct
        Highlander highlander2 = Highlander.getHighlander();

        System.out.println( highlander2.tagline() );

    }

}
