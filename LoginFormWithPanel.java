import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormWithPanel {
    public LoginFormWithPanel() { 
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel name = new JLabel("UserName");
    name.setBounds(10,10,120,50);
    name.setFont(new Font("Serif", Font.BOLD, 24));
    panel1.add(name); 
    JTextField txt1 = new JTextField();
    txt1.setBounds(160,10,130,50);
    panel1.add(txt1);
    JLabel pass = new JLabel("PassWord");
    pass.setBounds(10,80,120,50);
    pass.setFont(new Font("Serif", Font.BOLD, 24));
    panel1.add(pass);
    JPasswordField txt2 = new JPasswordField();
    txt2.setBounds(160,80,130,50);
    panel1.add(txt2);
    JButton btn = new JButton();
    btn.setText("Submit");
    btn.setFont(new Font ("Serif", Font.BOLD, 14));
    btn.setBounds(150,160,100,50);
    panel1.add(btn);
    panel1.setLayout(null);
    panel1.setBackground(Color.GRAY);
    panel1.setPreferredSize(new Dimension(300,600));
    frame.add(panel1,BorderLayout.WEST);
    frame.add(panel2,BorderLayout.EAST);
    JLabel result1 = new JLabel();
    result1.setFont(new Font("Serif", Font.PLAIN, 24));
    result1.setBounds(160,350, 300, 150);
    panel2.add(result1);
    JLabel result2 = new JLabel();
    result2.setFont(new Font("Serif", Font.PLAIN, 24));
    result2.setBounds(160,550, 300, 150);
    panel2.add(result2);
    panel2.setLayout(new FlowLayout());
    panel2.setBackground(Color.BLUE);
    panel2.setPreferredSize(new Dimension(300,600));
    frame.setSize(600,600);
    frame.setVisible(true);
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nm= txt1.getText().toString();
            String pwd = new String(txt2.getPassword());
            result1.setText("UserName="+nm);
            result2.setText("Password="+pwd);
        }});

    }
    
  public static void main(String[] args) {
      new LoginFormWithPanel();
  }

}
