import javax.swing.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class task53 extends JFrame {

    public task53(String a) throws IOException {
        super("background");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedImage img = ImageIO.read(new File(a));
        JLabel label = new JLabel(new ImageIcon(img));
        add(label);
    }

    public static void main(String[] args) throws IOException {
        new task53("C:\\Users\\georg\\Desktop\\Java\\main\\src\\background.jpg").setVisible(true);
    }
}