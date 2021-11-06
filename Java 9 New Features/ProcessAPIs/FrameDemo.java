import java.awt.*;
import java.awt.event.*;
public class FrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.add(new Label("This process started from java using " + args[0] + " !!! "));
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
