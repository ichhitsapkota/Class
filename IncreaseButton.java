
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IncreaseButton {
    int a=0;
    public IncreaseButton() { 
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton btn = new JButton("Increase");
    panel1.add(btn);
    panel1.setLayout(new FlowLayout());
    frame.add(panel1,BorderLayout.EAST);
    JLabel lbl1= new JLabel("The number is:");
    panel2.add(lbl1);
    frame.add(panel2,BorderLayout.WEST);
    JLabel result = new JLabel("0");
    panel2.add(result);
    panel2.setLayout(new FlowLayout());
    frame.setSize(300,300);
    frame.setVisible(true);
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            a=a+1;
            result.setText(String.valueOf(a));
            System.out.println(a);
        }});

    }
    
  public static void main(String[] args) {
      new IncreaseButton();
  }

}
