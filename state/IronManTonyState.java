package state;

public class IronManTonyState implements State {
    AnthonyEdwardStark tony;

    public IronManTonyState(AnthonyEdwardStark tony){
        this.tony = tony;
    }

    public void tinkerWithTech(){
        System.out.println("After a long day of fighting, Tony needs to fix his suit.");

        //turn into AtHomeTony
        tony.setState(tony.getAtHomeTonyState());
    }

    public void assembleWithTeam(){
        System.out.println("Tony is already in the fight!");
    }

    public void meetWithPeople(){
        System.out.println("Press conference time: Let's talk about how the Avengers saved the world!");

        //turn into PublicFigureTony
        tony.setState(tony.getPublicFigureState());
    }

}
