package template_method;

public abstract class Story {

    abstract void beginning();
    abstract void conflict();
    abstract void end();

    public final void plot() {

        //start the story
        beginning();

        //conflict arises
        conflict();

        //end story
        end();
    }
}
