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
        //Inicializando variáveis para armazenar o tamanho e as posições do solo.   
        int inicio = 20, limite = myCanvas.getSize().width - 20, solo = myCanvas.getSize().height - 70;

        // crate and show the balls
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe quantas bolas: ");
        int balls = teclado.nextInt();

        if( balls <= 0 ){
            System.out.println("Número inválido!");
            return;
        }

        // draw the ground
        myCanvas.setVisible(true);
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(inicio, solo, limite, solo);
        
        //Para poder tratar a quantidade de bolas de forma inderteminada, vamos criar uma coleção com o número informado como tamanho
        ArrayList<BouncingBall> array_Balls = new ArrayList<BouncingBall>(balls);

        //Como a questão pede que sejam geradas bolas de cores aleatórias, criarei também um vetor com as cores disponíveis na classe java.awt.Color
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

        //Selecionadas as cores, precisamos criar as bolas, com cores aleatórias em lugares aleatórios
        //Para isso, precisamos de uma variável do tipo Random
        Random random = new Random();

        //Agora criaremos as bolas

        for(int i = 0; i < balls; i++){
            BouncingBall bola = new BouncingBall(inicio + random.nextInt(myCanvas.getSize().height), inicio + random.nextInt(myCanvas.getSize().height) - 20,
                                         random.nextInt(20), cores[random.nextInt(13)], solo, myCanvas);
            array_Balls.add(bola);
            array_Balls.get(i).draw();
            myCanvas.wait(50);
        }

        int x = 1;

        do{
            myCanvas.wait(50);
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
