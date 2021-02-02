import java.awt.*;
import java.awt.event.*;

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
        mainFrame.setLayout(new GridLayout(3, 2));
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

        mainFrame.setBackground(Color.BLUE);
        mainFrame.add(header);
        mainFrame.add(controlPanel);
        mainFrame.add(status);
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        Demo dObj = new Demo();
        dObj.display();
    }

    private void display()
    {
        header.setText("Select Task");

        Button pack = new Button("Pack");
        Button unpack = new Button("Unpack");

        pack.setActionCommand("Pack");
        unpack.setActionCommand("Unpack");

        pack.addActionListener(new Hello());
        unpack.addActionListener(new Hello());

        controlPanel.add(pack);
        controlPanel.add(unpack);

        mainFrame.setVisible(true);
    }
    private class Hello implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String cmd = e.getActionCommand();
            if(cmd.equals("Pack"))
            {
                status.setText("You Have Selected Java Packer Application");
            }
            else if(cmd.equals("Unpack"))
            {
                status.setText("You Have Selected Java Unpacker Application");
            }
        }
    }
}
