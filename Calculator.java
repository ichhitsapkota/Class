import com.sun.source.doctree.SummaryTree;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator{
public static void main(String[] args){
Frame frame = new Frame("LOGIN FORM");
frame.setSize(400,500);
frame.setVisible(true);
frame.setLayout(null);
Label lbl1=new Label("Welcome Back. You've been missed!!");
lbl1.setBounds(100, 50, 210, 30);
lbl1.setBackground(Color.CYAN);
frame.add(lbl1);
Label lbl2=new Label("First Num");
lbl2.setBounds(40, 100, 80, 30);
frame.add(lbl2);
TextField txt1 = new TextField();
txt1.setBounds(120, 100, 200, 30);
frame.add(txt1);
Label lbl3=new Label("Second Num");
lbl3.setBounds(40, 160, 80, 30);
frame.add(lbl3);
TextField txt2=new TextField();
txt2.setBounds(120,160,200,30);
frame.add(txt2);
Button btm1 = new Button("Reset");
btm1.setBounds(40,200,60,30);
frame.add(btm1);
Button btm2 = new Button("Calculate");
btm2.setBounds(260,200,60,30);
frame.add(btm2);
Label lbl4=new Label("The SUM is:");
lbl4.setBounds(40, 250, 200, 30);
frame.add(lbl4);
Label myResult=new Label("0");
myResult.setBounds(40, 300, 200, 30);
frame.add(myResult);
btm1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        txt1.setText(null);
        txt2.setText(null);
    }
});
btm2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
       String firstNum=txt1.getText();
       String secondNum=txt2.getText();
       //type conversion
       int a=Integer.parseInt(firstNum);
       int b =Integer.parseInt(secondNum);
       int sum=a+b;
       String result=String.valueOf(sum); 
       myResult.setText(result);
    }
});


    }
}