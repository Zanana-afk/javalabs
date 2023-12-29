package lab7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Border extends JFrame {
    JPanel[] pnl = new JPanel[6];
    private int milan = 0;
    private int madrid = 0;
    private String winner = "";
    JButton b1 = new JButton("AC Milan");
    JButton b2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");
    public Border(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i = 0; i < 6; i++){
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(255,255,255));
            add(pnl[i]);
        }
        setLayout(new GridLayout(2,3));
        pnl[0].setLayout(new BorderLayout());
        pnl[2].setLayout(new BorderLayout());
        pnl[0].add(b1, BorderLayout.CENTER);
        pnl[2].add(b2, BorderLayout.CENTER);
        pnl[3].add(lbl2);
        pnl[1].add(lbl3);
        pnl[4].add(lbl1);
        b1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                try {
                    ++Border.this.milan;
                    Border.this.lbl1.setText("Result: "+Border.this.milan+" X "+Border.this.madrid);
                    Border.this.lbl2.setText("Last Scorer: AC Milan");
                    if(Border.this.milan > Border.this.madrid){
                        Border.this.lbl3.setText("Winner: AC Milan");
                    }
                    if (Border.this.milan == Border.this.madrid){
                        Border.this.lbl3.setText("Winner: DRAW");
                    }
                }
                catch (Exception e){
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                try {
                ++Border.this.madrid;
                Border.this.lbl1.setText("Result: "+Border.this.milan+" X "+Border.this.madrid);
                Border.this.lbl2.setText("Last Scorer: Real Madrid");
                if(Border.this.milan < Border.this.madrid){
                    Border.this.lbl3.setText("Winner: Real Madrid");
                }
                if (Border.this.milan == Border.this.madrid){
                    Border.this.lbl3.setText("Winner: DRAW");
                }
            }
                catch (Exception e){}
            }
        });
        setSize(800,500);
    }
    
    
}
