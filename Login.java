package IchhitSapkota_220310_BCE_GroupA;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Login {
    public static void main(String[] args) {
        Frame frame = new Frame("Login Form");
        Label lblUserID = new Label("User ID");
        lblUserID.setBounds(30, 50, 70, 50);
        frame.add(lblUserID);
        TextField txtField = new TextField();
        txtField.setBounds(120, 50, 200, 50);
        Label lblPassCode = new Label("PassCode");
        lblPassCode.setBounds(30, 100, 70, 50);
        frame.add(lblPassCode);
        TextField pass = new TextField();
        pass.setBounds(120, 100, 200, 50);
        frame.add(pass);
        Button resetButton = new Button("Reset");
        resetButton.setBounds(30, 150, 70, 50);
        frame.add(resetButton);
        Button submitButton = new Button("Submit");
        submitButton.setBounds(120, 150, 70, 50);
        frame.add(submitButton);

        frame.add(txtField);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
