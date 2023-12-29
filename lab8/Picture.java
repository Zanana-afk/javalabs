package lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Picture {
    public static void main(String[] args){
        String r = "C:\\\\Users\\\\egor0\\\\OneDrive\\\\Изображения\\\\Снимки экрана\\\\123.jpg";
        JFrame frame = new JFrame ("Картинка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i=0; i<args.length; i++){
            r=args[i];
        }
        ImageIcon icon = new ImageIcon(r);
        JLabel label1;
        label1 = new JLabel("FreeBSD Left", icon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(200, 300));
        panel.add(label1);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
