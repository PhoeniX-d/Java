import java.awt.*;
import java.awt.event.*;

class Message extends Frame
{
    public Message()
    {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void paint(Graphics g)
    {
        // set background color of frame
        this.setBackground(Color.BLACK);
        
        // sent font for text
        Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 30);
        g.setFont(f);
        
        // set backgroiund color
        g.setColor(Color.GREEN);

        // display message
        g.drawString("Hello, World", 100, 100);
    }
    
    public static void main(String[] args) 
    {
        Message mainFrame = new Message();
        mainFrame.setSize(400, 400);
        mainFrame.setTitle("Message");
        mainFrame.setVisible(true);
    }
}
