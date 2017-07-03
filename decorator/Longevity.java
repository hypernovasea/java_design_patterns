package decorator;

/**
 * Created by artemis on 6/25/17.
 */
public class Longevity extends SuperpowerDecorator
{
    Superperson superperson;

    public Longevity(Superperson superperson)
    {
        this.superperson = superperson;
    }

    public String getDescription()
    {
        return superperson.getDescription() + "Living longer than normal. ";
    }

    public int powers()
    {
        return superperson.powers() + 1;
    }
}
