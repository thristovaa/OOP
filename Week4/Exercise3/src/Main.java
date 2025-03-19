// Let this class know that the SaxionApp exists.
import nl.saxion.app.SaxionApp;

import java.awt.*;

// Make sure your class implements the {@link Runnable} interface[^2].
public class Main implements Runnable {
    public static void main(String[] args) {
    }

    // This method is the starting point of your own saxion application.
    @Override
    public void run() {
        SaxionApp.turnBorderOff();

        Rectangle[] rectangles = {
                // Rectangle(x, y, width, height, color)
                new Rectangle(50, 50, 200, 100, Color.RED),
                new Rectangle(50, 250, 300, 150, Color.GREEN),
                new Rectangle(50, 450, 400, 50, Color.YELLOW)
        };
//        Circle[] circles = {
//                // Circle(x, y, radius, color)
//                new Circle(100, 100, 50, Color.RED),
//                new Circle(100, 300, 75, Color.GREEN),
//                new Circle(100, 600, 100, Color.YELLOW)
//        };
//        Square[] squares = {
//                // Square(x, y, size, color)
//                new Square(50, 50, 50, Color.RED),
//                new Square(50, 250, 250, Color.GREEN),
//                new Square(50, 600, 100, Color.YELLOW)
//        };
//
        // Print all rectangles
        for(Rectangle rectangle : rectangles) {
            rectangle.draw();

            int textX = 700;
            int textY = rectangle.getY();
            SaxionApp.drawBorderedText("Circumference: "+ rectangle.getCircumference() + " (pixels)", textX, textY, 20);
            SaxionApp.drawBorderedText("Area: "+ rectangle.getArea() + " (pixels)", textX, textY + 20, 20);
        }
//
//        SaxionApp.pause();
//        SaxionApp.clear();
//
//        // Print all circles
//        for(Circle circle : circles) {
//            circle.draw();
//
//            int textX = 300;
//            int textY = circle.getY() - (int) (0.5 * circle.getRadius());
//            SaxionApp.drawBorderedText("Circumference: "+ circle.getCircumference() + " (pixels)", textX, textY, 20);
//            SaxionApp.drawBorderedText("Area: "+ circle.getArea() + " (pixels)", textX, textY + 20, 20);
//        }
//
//        SaxionApp.pause();
//        SaxionApp.clear();
//
//        // Print all squares
//        for(Square square : squares) {
//            square.draw();
//
//            int textX = 500;
//            int textY = square.getY();
//            SaxionApp.drawBorderedText("Circumference: "+ square.getCircumference() + " (pixels)", textX, textY, 20);
//            SaxionApp.drawBorderedText("Area: "+ square.getArea() + " (pixels)", textX, textY + 20, 20);
//        }
    }
}