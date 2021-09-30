import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
 
public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75; // how long the game takes
    final int x[] = new int[GAME_UNITS]; // holds x coordinates of objects such as snake head
    final int y[] = new int[GAME_UNITS]; // holds y coordinates of objects such as snake head
    int bodyparts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R'; //makes the snake move to the right when the game begins
    boolean running = false;
    Timer timer;
    Random Random;

    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        StartGame();
        
    }

    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);

    }
    public void draw(Graphics g){

    }
    public void newApple(){

    }
    public void move(){

    }
    public void checkApple(){

    }
    public void checkCollisions(){

    }
    public void gameOver(){

    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(keyEvent e){

        }
    }
     
}
