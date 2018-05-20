package proxy;

public class ProxyCaptainAmerica implements CaptainAmerica {

    private OriginalCaptainAmerica ogCap;
    private String name;

    public ProxyCaptainAmerica(String name){
        this.name = name;
    }

    public void action(String action) {
        if(ogCap == null){
            ogCap = new OriginalCaptainAmerica();
        }
        System.out.println("Standing in for " + ogCap.getName());
        ogCap.action(action);
    }



}
