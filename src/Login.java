import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

	JButton loginButton, clearButton, signUpButton;
	JTextField cardTextField;
	JPasswordField pinTextField;

	Login() {

		setTitle("ATM Machine");
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);

		JLabel text = new JLabel("Welcome to ATM Machine");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text);

		JLabel cardNo = new JLabel("Card No");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 24));
		cardNo.setBounds(120, 150, 150, 40);
		add(cardNo);

		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 40);
		add(cardTextField);

		JLabel pin = new JLabel("PIN");
		pin.setFont(new Font("Raleway", Font.BOLD, 24));
		pin.setBounds(120, 220, 250, 40);
		add(pin);

		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 230, 40);
		add(pinTextField);

		loginButton = new JButton("Sign In");
		loginButton.setBounds(300, 300, 100, 30);
		loginButton.setBackground(Color.BLACK);
		loginButton.setForeground(Color.WHITE);
		loginButton.addActionListener(this);
		add(loginButton);

		clearButton = new JButton("Clear");
		clearButton.setBounds(430, 300, 100, 30);
		clearButton.setBackground(Color.BLACK);
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		add(clearButton);

		signUpButton = new JButton("Sign Up");
		signUpButton.setBounds(300, 350, 230, 30);
		signUpButton.setBackground(Color.BLACK);
		signUpButton.setForeground(Color.WHITE);
		signUpButton.addActionListener(this);
		add(signUpButton);

		getContentPane().setBackground(Color.WHITE);

		setSize(800, 450);
		setVisible(true);
		setLocation(350, 200);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			cardTextField.setText("");
			pinTextField.setText("");
		} else if (e.getSource() == loginButton) {

		} else if (e.getSource() == signUpButton) {
			setVisible(false);
			new SignupOne().setVisible(true);
		}

	}

	public static void main(String[] args) {
		new Login();
	}

}
