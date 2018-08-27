import java.awt.*;
import java.util.*;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo {
    private Canvas myCanvas;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo() {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
    }
 
    /**
     * Simulate two bouncing balls
     */
    public void bounce() {
        //Initializing variables to store the size and positions of the soil.  
        int inicio = 20, limite = myCanvas.getSize().width - 20, solo = myCanvas.getSize().height - 70;

        //Receiving Amount of Balls
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe quantas bolas: ");
        int balls = teclado.nextInt();

        if( balls <= 0 ){
            System.out.println("Número inválido!");
            return;
        }

        // Drawning the grount
        myCanvas.setVisible(true);
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(inicio, solo, limite, solo);
        
        //In order to be able to treat the quantity of balls indefinitely, we will create a collection with the number informed as size
        ArrayList<BouncingBall> array_Balls = new ArrayList<BouncingBall>(balls);

        //As the question asks for random color balls to be generated, I will also create a vector with the colors available in class java.awt.Color
        Color cores[] = new Color[13];
        cores[0] = Color.BLACK;
        cores[1] = Color.BLUE;
        cores[2] = Color.CYAN;
        cores[3] = Color.DARK_GRAY;
        cores[4] = Color.GRAY;
        cores[5] = Color.GREEN;
        cores[6] = Color.LIGHT_GRAY;
        cores[7] = Color.MAGENTA;
        cores[8] = Color.ORANGE;
        cores[9] = Color.PINK;
        cores[10] = Color.RED;
        cores[11] = Color.WHITE;
        cores[12] = Color.YELLOW;

        //Selected the colors, we need to create the balls, with random colors in random places
        //For this, we need a variable of type Random
        Random random = new Random();

        //Now we create the balls

        for(int i = 0; i < balls; i++){
            //Creating a ball that is in a random spot on the Canvas, as long as it is above ground and within bounds
            //In addition, with 1 random color array of colors
            BouncingBall bola = new BouncingBall(inicio + random.nextInt(myCanvas.getSize().height), inicio + random.nextInt(myCanvas.getSize().height) - 20,
                                         random.nextInt(20), cores[random.nextInt(13)], solo, myCanvas);
            //Adding the new ball to the collection of balls by drawing it, and waiting for 50 to make the next one (same number that was set in the original code)
            array_Balls.add(bola);
            array_Balls.get(i).draw();
            myCanvas.wait(50);
        }

        //Variable that will determine the end of the loop
        int x = 1;

        do{
            myCanvas.wait(50);
            //Traversing with a foreach the collection of balls and causing them to move until they all exceed the limit of the canvas
            for(BouncingBall b : array_Balls){
                b.move();
                int bolasForaDoCanvas = 0;
                for(BouncingBall b2 : array_Balls){
                    if(b2.getXPosition() >= limite){
                        bolasForaDoCanvas += 1;
                    }
                }
                if(bolasForaDoCanvas >= balls){
                    x = 0;
                }
            }
        } while(x!=0);

        //Once they all exceed the limit, they are deleted
        for(int i = 0; i < balls; i++){
            array_Balls.get(i).erase();
        }


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
