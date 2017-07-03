package facade;

/**
 * Created by artemis on 7/3/17.
 */
public class ShapeFacade {

    private Shape circle;
    private Shape rectangle;
    private Shape triangle;

    public ShapeFacade(){
        circle = new Circle();
        rectangle = new Rectangle();
        triangle = new Triangle();
    }


    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawTriangle(){
        triangle.draw();
    }
}
