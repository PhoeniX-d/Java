import java.awt.*;
import java.awt.event.*;

class Test
{
    Frame f;
    Button b1, b2, b3;

    Test()
    {
        f = new Frame();
        f.setLayout(null);
        f.setSize(300, 300);
        f.setTitle("Push Buttons");
        f.setVisible(true);

        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");

        b1.setBounds(100, 100, 70, 40);
        b2.setBounds(100, 160, 70, 40);
        b3.setBounds(100, 220, 70, 40);

        f.add(b1);
        f.add(b2);
        f.add(b3);

        b1.addActionListener(new Event());
        b2.addActionListener(new Event());
        b3.addActionListener(new Event());

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

       // f.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        Test t = new Test();
    }

    private class Event implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String str = ae.getActionCommand();
            if(str.equals("Red"))
            {
                f.setBackground(Color.RED);
            }
            else if(str.equals("Green"))
            {
                f.setBackground(Color.GREEN);
            }
            else if(str.equals("Blue"))
            {
                f.setBackground(Color.BLUE);
            }
        }
    }
}
