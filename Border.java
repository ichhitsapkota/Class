import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Border{
    Border(){
       JFrame frame = new JFrame();
       JButton b1 = new JButton("NORTH");
       JButton b2 = new JButton("SOUTH");
       JButton b3 = new JButton("EAST");
       JButton b4 = new JButton("WEST");
       JButton b5 = new JButton("CENTER");
       frame.add(b1,BorderLayout.NORTH);
       frame.add(b2,BorderLayout.SOUTH);
       frame.add(b3,BorderLayout.EAST);
       frame.add(b4,BorderLayout.WEST);
       frame.add(b5,BorderLayout.CENTER);
       frame.addWindowListener(new WindowListener() {

        @Override
        public void windowOpened(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            // TODO Auto-generated method stub
            frame.dispose();
            throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
        }
        
       });
       frame.setSize(300,300);
       frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Border();
    }
}