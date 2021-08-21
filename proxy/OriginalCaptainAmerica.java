package proxy;

public class OriginalCaptainAmerica implements CaptainAmerica {

    private String name = "Steve Rogers";

    
    public OriginalCaptainAmerica() {
        grabsShield();
    }


    public void action(String action) {
        System.out.println(action);
    }


    public void grabsShield() {
        System.out.println("* suits up and grabs shield *");
    }


    public String getName() {
        return name;
    }
}
