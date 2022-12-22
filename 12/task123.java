import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class task123 extends JFrame {
    protected static Image image;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    task123(){
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
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\1.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\2.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\3.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\4.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\5.gif").getImage());


        task123 A = new task123();
        while (true) {
            for (int i = 0; i < 5; i++)
            {
                image = framlist.get(i);
                A.repaint();
                try
                {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
