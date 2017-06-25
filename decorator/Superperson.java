package decorator;

/**
 * Abstract class to represent the Superperson object.
 */

public abstract class Superperson
{

    String description = "";

    public String getDescription()
    {
        return description;
    }


    public abstract int powers();
}
