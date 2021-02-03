import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Font;
import java.awt.Frame;

class Test implements ActionListener
{

	private Frame mainFrame;
	private Panel top, header, content;
	private Button minimize, exit, pack, unpack;
	private Label label, status;

	Test()
	{
		initialize();
	}
	public void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(380, 180, 650, 450);
		mainFrame.setLayout(null);
		mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
		
		top = new Panel();
		top.setBounds(0, 0, 650, 25);
		top.setBackground(Color.LIGHT_GRAY);
		top.setLayout(null);
		mainFrame.add(top);
		
		minimize = new Button("-");
		minimize.setBounds(0, 0, 25, 25);
		minimize.setFont(new Font("Courier New", Font.BOLD, 16));
		top.add(minimize);
		
		exit = new Button("X");
		exit.setBounds(27, 0, 25, 25);
		exit.setFont(new Font("Courier New", Font.BOLD, 16));
		top.add(exit);
		
	
		header = new Panel();
		header.setBounds(0, 25, 650, 125);
		header.setBackground(Color.WHITE);
		mainFrame.add(header);
		header.setLayout(null);
		
		label = new Label("Select Task");
		label.setFont(new Font("Courier New", Font.BOLD, 16));
		label.setAlignment(Label.CENTER);
		label.setBounds(160, 35, 300, 30);
		header.add(label);
		
		content = new Panel();
		content.setBounds(0, 150, 650, 300);
		content.setBackground(new Color(0, 50, 120));
		mainFrame.add(content);
		content.setLayout(null);
		
		pack = new Button("Pack");
		pack.setFont(new Font("Courier New", Font.BOLD, 16));
		pack.setBounds(150, 90, 80, 50);
		content.add(pack);
		
		unpack = new Button("Unpack");
		unpack.setFont(new Font("Courier New", Font.BOLD, 16));
		unpack.setBounds(400, 90, 80, 50);
		content.add(unpack);
		
		status = new Label();
		status.setAlignment(Label.CENTER);
		status.setBounds(150, 200, 342, 22);
		content.add(status);
		mainFrame.setVisible(true);
		
		pack.addActionListener(this);
		unpack.addActionListener(this);
		minimize.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == pack)
		{
			status.setText("You Have Selected Pack Activity");
		}
		else if(ae.getSource() == unpack)
		{
			status.setText("You Have Selected Unpack Activity");
		}
		if (ae.getSource() == exit)
		{
			System.exit(0);
		}
		else if (ae.getSource() == minimize)
		{
			mainFrame.setState(Frame.ICONIFIED);
		}
		status.setFont(new Font("Courier New", Font.BOLD, 13));
		status.setForeground(Color.GREEN);
	}
	public static void main(String[] args)
	{
		new Test();
	}
}
