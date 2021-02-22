import java.awt.*;
import java.awt.event.*;

class Test {
    public static void main(String[] args) {
        Frame f = new Frame();
        // Instead of Constructor use setTitle Method
        f.setTitle("My AWT Frame 3");
        f.setSize(500, 500);
        f.setVisible(true);
        
        /* Anoymous inner clas */
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}

/* Using WindowListener interface 
class Hello implements WindowListener
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
}
*/

/* Using Adaptor class WindowAdaptor
class Hello extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
*/