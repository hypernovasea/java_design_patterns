package iterator;

public class XMan implements Mutant {

    String name;
    String power;

    public XMan(String name, String power) {
        this.name = name;
        this.power = power;
    }


    public void mutation() {
        System.out.print(power);
    }
}
