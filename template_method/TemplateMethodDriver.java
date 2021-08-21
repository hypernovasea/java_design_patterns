package template_method;

/**
 * Drives the template method program.
 *
 * The Template Method design pattern is a BEHAVIORAL design pattern in which
 * a skeleton of an algorithm is devised. The template method lets subclasses
 * redefine certain steps of the algorithm without changing the overall structure
 * of the algorithm.
 *
 * In this example, the general structure of a story is defined as having a beginning,
 * some conflict, and an end. There are two kinds of stories: love stories and mysteries and
 * although they have different kinds of details, characters, and tone, the general plot
 * structure (as defined in the Story template) is the same.
 *
 */
public class TemplateMethodDriver {

    public static void main(String[] args) {

        Story loveStory = new LoveStory();
        loveStory.plot();

        Story mystery = new MysteryStory();
        mystery.plot();
    }
}
