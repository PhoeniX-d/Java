import java.awt.*;
import java.awt.event.*;

import jdk.internal.org.objectweb.asm.Label;

class Demo
{
    // characteristics 
    Frame mainFrame;
    Label header;
    Label status;
    Panel controlPanel;

    // constructor
    public Demo()
    {
        mainFrame = new Frame("Packer&Unpacker");
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        header = new Label();
        header.setAlignment(Label.CENTER);

        status = new Label();
        status.setAlignment(Label.CENTER);
        status.setSize(350, 100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(header);
        mainFrame.add(controlPanel);
        mainFrame.add(status);
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        Demo dObj = new Demo();
        dObj.Display();
    }

    private void display()
    {
        header
    }
}