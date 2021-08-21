package facade;

/**
 * Drives the facade design pattern.
 *
 * The Facade design pattern is a STRUCTURAL design pattern in which
 * an interface is used to hide the complexity of the subsystem.
 *
 * In this example, the ShapeFacade class hides away the concrete Circle,
 * Rectangle, and Triangle objects from the driver program. All the driver
 * knows is that the ShapeFacade will give it a Shape.
 */
public class FacadeDriver {

    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawTriangle();
    }
}
