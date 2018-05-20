package proxy;

public class ProxyPatternDriver {

    public static void main(String[] args){

        CaptainAmerica cap = new ProxyCaptainAmerica("Bucky Barnes");
        cap.action("* throws shield *");

    }
}
