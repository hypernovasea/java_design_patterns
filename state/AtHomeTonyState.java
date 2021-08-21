package state;

public class AtHomeTonyState implements State {

    AnthonyEdwardStark tony;


    public AtHomeTonyState(AnthonyEdwardStark tony) {
        this.tony = tony;
    }


    public void tinkerWithTech() {
        System.out.println("Tony is tinkering with some tech in his lab at home.");
    }


    public void assembleWithTeam() {
        System.out.println("Tony jumps into his suit. It's time to assemble!");

        //turn into IronManTony
        tony.setState(tony.getIronManState());
    }


    public void meetWithPeople() {
        System.out.println("Time to shake hands and do business.");

        //turn into PublicFigureTony
        tony.setState(tony.getPublicFigureState());
    }

}
