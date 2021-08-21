package state;

public class AnthonyEdwardStark {

    State atHomeState;
    State ironManState;
    State publicFigureState;
    State state;
    String catchphrase;


    public AnthonyEdwardStark(String catchphrase) {
        atHomeState = new AtHomeTonyState(this);
        ironManState = new IronManTonyState(this);
        publicFigureState = new PublicFigureTonyState(this);

        state = atHomeState;
        this.catchphrase = catchphrase;
    }


    public void tinker() {
        state.tinkerWithTech();
    }


    public void assemble() {
        state.assembleWithTeam();
    }


    public void meet() {
        state.meetWithPeople();
    }


    public void setState(State state) {
        this.state = state;
    }


    public State getAtHomeTonyState() {
        return atHomeState;
    }


    public State getIronManState() {
        return ironManState;
    }


    public State getPublicFigureState() {
        return publicFigureState;
    }

    
    public void getCatchphrase() {
        System.out.println(catchphrase);
    }
}
