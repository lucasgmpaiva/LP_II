import java.awt.*;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo {
    private Canvas myCanvas;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo() {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
    }
 
    /**
     * Simulate two bouncing balls
     */
    public void bounce() {
    /*
        int ground = 400;   // position of the ground line
        int xStart = 50;    // x-start of the ground line
        int xLimit = 550;   // x-limit of the ground line
     */
        Dimension sizeOfCanvas = myCanvas.getSize();
        int xStart = 20, xBound = sizeOfCanvas.width - 20, yGround = sizeOfCanvas.height - 70;

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, yGround, xBound, yGround);

        // crate and show the balls
        BouncingBall ball = new BouncingBall(xStart, 50, 16, Color.blue, yGround, myCanvas);
        ball.draw();
        BouncingBall ball2 = new BouncingBall(xStart + 20, 80, 20, Color.red, yGround, myCanvas);
        ball2.draw();

        // Make them bounce until both have gone beyond the xLimit.
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
            ball2.move();
            // stop once ball has travelled a certain distance on x axis
            if(ball.getXPosition() >= xBound && ball2.getXPosition() >= xBound) {
                finished = true;
            }
        }
        ball.erase();
        ball2.erase();
    }
    /**
     * Method to draw a frame with a rectangle with 20px of distance to the border of the canvas. It works with any size of Canvas.
     * @param  void 
     * @return void
     * @author Lucas Gabriel Matias Paiva 
     */
    public void drawFrame() {
        Dimension sizeOfCanvas = myCanvas.getSize();
        Rectangle rect = new Rectangle(20, 20, sizeOfCanvas.width - 40, sizeOfCanvas.height - 40);
        myCanvas.erase(rect);
        myCanvas.draw(rect);
    }
    
}
