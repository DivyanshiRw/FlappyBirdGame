import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int bdWidth= 360;
        int bdHeight= 640;

        JFrame frame= new JFrame("Flappy Bird");
        frame.setSize(bdWidth, bdHeight);
        frame.setLocationRelativeTo(null);   //place window at the centre of screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        FlappyBird flappyBird= new FlappyBird();
        frame.add(flappyBird);
        frame.pack();             //to exclude titlebar in dimensions of panel
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
