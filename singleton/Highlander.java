package singleton;

public class Highlander {

    private static Highlander highlander;
    private String name;
    private String location;


    //private constructor
    private Highlander() {}


    public static Highlander getHighlander() {
        if(highlander == null) {
            highlander = new Highlander();
        }
        return highlander;
    }


    public String tagline() {
        return "There can only be one.";
    }

}
