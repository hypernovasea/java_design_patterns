package observer;

public class Comedian implements Observer {

    private HumorSubject subject;
    private String name;
    private String current_book;

    public Comedian(HumorSubject subject, String name) {
        this.name = name;
        subject.registerComedian(this);
    }


    public void update(String current_book) {
        this.current_book = current_book;
    }


    public String getName() {
        return name;
    }


    public String getCurrentBook() {
        return current_book;
    }


    public void unregister() {
        subject.removeComedian(this);
    }
}
