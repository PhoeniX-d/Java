import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Login implements ActionListener
{

	private JFrame mainFrame;
	private JPanel top, header, content;
	private JButton submit, exit, minimize;
	private JLabel label, status, username;
	private JPasswordField passwordField;
	private JTextField textField;
	private JLabel lblNewLabel;

	Login()
	{
		initialize();
	}
	public void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(380, 180, 650, 450);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
		
		top = new JPanel();
		top.setBounds(0, 0, 634, 25);
		top.setBackground(Color.LIGHT_GRAY);
		top.setLayout(null);
		mainFrame.getContentPane().add(top);
		
		minimize = new JButton("-");
		minimize.setFont(new Font("Courier New", Font.BOLD, 14));
		minimize.setBounds(0, 0, 45, 25);
		top.add(minimize);
		
		exit = new JButton("X");
		exit.setFont(new Font("Courier New", Font.BOLD, 14));
		exit.setBounds(46, 0, 45, 25);
		top.add(exit);
		
	
		header = new JPanel();
		header.setBounds(0, 25, 634, 93);
		header.setBackground(Color.WHITE);
		mainFrame.getContentPane().add(header);
		header.setLayout(null);
		
		label = new JLabel("File Packer and Unpacker");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(160, 35, 317, 30);
		label.setFont(new Font("Courier New", Font.BOLD, 20));
		label.setAlignmentX(JLabel.CENTER);
		header.add(label);
		
		content = new JPanel();
		content.setBounds(0, 116, 634, 295);
		content.setBackground(new Color(0, 50, 120));
		mainFrame.getContentPane().add(content);
		content.setLayout(null);
		
		status = new JLabel("User Login");
		status.setHorizontalAlignment(SwingConstants.CENTER);
		//status.setBackground(new Color(0, 50, 120));
		status.setForeground(Color.WHITE);
		status.setFont(new Font("Courier New", Font.BOLD, 20));
		status.setAlignmentX(JLabel.CENTER);
		status.setBounds(242, 22, 145, 30);
		content.add(status);
		
		username = new JLabel("USERNAME :");
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setBounds(75, 94, 120, 30);
		//username.setBackground(new Color(0, 50, 120));
		username.setForeground(Color.WHITE);
		username.setFont(new Font("Courier New", Font.BOLD, 17));
		username.setAlignmentX(JLabel.LEFT);
		content.add(username);
				
		submit = new JButton("Submit");
		submit.setFont(new Font("Courier New", Font.BOLD, 17));
		submit.setBounds(242, 203, 145, 23);
		content.add(submit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(252, 147, 322, 30);
		content.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(252, 97, 322, 26);
		content.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("PASSWORD :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 17));
		lblNewLabel.setBounds(75, 147, 120, 30);
		content.add(lblNewLabel);
		
		minimize.addActionListener(this);
		exit.addActionListener(this);
		mainFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
        if (ae.getSource() == exit)
        {
            System.exit(0);
        }
        else if (ae.getSource() == minimize)
        {
            mainFrame.setState(JFrame.ICONIFIED);
        }
	}
	public static void main(String[] args)
	{
		new Login();
	}
}
