import javax.swing.*;
import java.awt.*;

public class fun extends JFrame{
	static JLabel password1, label;
	static JTextField username;
	static JButton button;
	static JPasswordField Password;
	static JFrame f = new JFrame();
	fun()
	{
		label = new JLabel("Username");
		label.setBounds(100, 8, 70, 20);
		f.add(label);
		username = new JTextField(20);
		username.setBounds(100, 27, 193, 28);
		f.add(username);
		password1 = new JLabel("Password");
		password1.setBounds(100, 55, 70, 20);
		f.add(password1);
		Password = new JPasswordField();
		Password.setBounds(100, 75, 193, 28);
		f.add(Password);
		button = new JButton("Login");
		button.setBounds(100, 110, 90, 25);
		button.setForeground(Color.WHITE);
		button.setBackground(Color.BLACK);
		f.add(button);
		f.setLayout(null);
		f.setSize(400,200);
		f.setVisible(true);
		f.setTitle("Login page");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		new fun();
	}
}
