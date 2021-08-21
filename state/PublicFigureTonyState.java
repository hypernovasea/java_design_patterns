package state;

public class PublicFigureTonyState implements State {

    AnthonyEdwardStark tony;


    public PublicFigureTonyState(AnthonyEdwardStark tony) {
        this.tony = tony;
    }


    public void tinkerWithTech() {
        System.out.println("Sigh. Time to relax at home with some tinker sessions.");
        tony.setState(tony.getAtHomeTonyState());
    }


    public void assembleWithTeam() {
        System.out.println("Forget this boring meeting! It's time to assemble!");
        tony.setState(tony.getIronManState());
    }


    public void meetWithPeople() {
        System.out.println("Shaking hands and kissing babies!");
    }

}
