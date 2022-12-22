import javax.swing.*;

public class task54 extends Animation {
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\1.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\2.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\3.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\4.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\georg\\Desktop\\Java\\main\\src\\frames\\5.gif").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 5; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
