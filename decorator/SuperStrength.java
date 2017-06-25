package decorator;

/**
 * Created by artemis on 6/25/17.
 */
public class SuperStrength extends SuperpowerDecorator
{
    Superperson superperson;

    public SuperStrength(Superperson superperson)
    {
        this.superperson = superperson;
    }

    public String getDescription()
    {
        return superperson.getDescription() + "Super-strong. ";
    }


    public int powers()
    {
        return superperson.powers() + 1;
    }
}
