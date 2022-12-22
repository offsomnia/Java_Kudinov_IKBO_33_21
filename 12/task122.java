
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class task122 extends JFrame {
    protected static Image image;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    task122(){
        setLayout(new FlowLayout());
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 960, 580, null);
    }


    public static void main(String[] args) {
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\background.jpg").getImage());
        task122 A = new task122();
        
        image = framlist.get(0);
        A.repaint();
        try
        {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}