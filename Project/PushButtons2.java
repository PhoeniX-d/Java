import java.awt.*;
import java.awt.event.*;

class Test2 extends Frame implements ActionListener
{
    Button b1, b2, b3;

    Test2()
    {
       
        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");

        b1.setBounds(100, 100, 70, 40);
        b2.setBounds(100, 160, 70, 40);
        b3.setBounds(100, 220, 70, 40);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        Object o = ae.getSource();
        if(o == b1)
        {
            this.setBackground(Color.RED);
        }
        else if(o == b2)
        {
            this.setBackground(Color.GREEN);
        }
        else if(o == b3)
        {
            this.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) 
    {
        Test2 t = new Test2();
        t.setLayout(new FlowLayout());
        t.setSize(300, 300);
        t.setTitle("Push Buttons");
        t.setVisible(true);
    }

}
