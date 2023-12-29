package lab8;

import javax.swing.*;
import java.awt.*;

public class Animation extends JFrame {

    public Animation() {
        setSize(800,600);

        JPanel panel = new JPanel() {
            ImageIcon[] frames;
            int currentFrameIndex = 0;

            
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image currentFrame = frames[currentFrameIndex].getImage();
                g.drawImage(currentFrame, 0, 0, this);
            }

            
            public void addNotify() {
                super.addNotify();

                frames = new ImageIcon[3];
                frames[0] = new ImageIcon("C:\\Users\\egor0\\OneDrive\\Изображения\\Снимки экрана\\123.jpg");
                frames[1] = new ImageIcon("C:\\Users\\egor0\\OneDrive\\Изображения\\Снимки экрана\\1233.jpg");

                Timer timer = new Timer(200, e -> {
                    currentFrameIndex = (currentFrameIndex + 1) % frames.length;
                    repaint();
                });
                timer.start();
            }
        };

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Animation().setVisible(true);
    }
}