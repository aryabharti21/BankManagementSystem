import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class SignupTwo extends JFrame implements ActionListener {

	JTextField panTextField, adhaarTextField;
	JRadioButton yesSen, noSen, yesRadioBtn, noRadioBtn;
	JButton nextButton;
	JLabel religion, category, income, educational, qualification, occupation, panNumber, aadharNo, existsAcc, citizen;
	JComboBox religionbox, categoryBox, incomeBox, occuBox, educationBox;
	long random;
	String formno;

	public SignupTwo(String formno) {

		this.formno = formno;
		setLayout(null);

		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L) + 1000L);

		setTitle("NEW ACCOUNT APPLICATION FORM 2");

		JLabel additionalDetails = new JLabel("Page 2: Additional Details ");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);

		religion = new JLabel("Religion : ");
		religion.setFont(new Font("Raleway", Font.BOLD, 20));
		religion.setBounds(100, 140, 100, 30);
		add(religion);

		String valReligion[] = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
		religionbox = new JComboBox(valReligion);
		religionbox.setBounds(300, 140, 400, 30);
		religionbox.setBackground(Color.WHITE);
		add(religionbox);

		category = new JLabel("Category : ");
		category.setFont(new Font("Raleway", Font.BOLD, 20));
		category.setBounds(100, 190, 200, 30);
		add(category);

		String valCategory[] = { "General", "OBC", "SC", "ST", "Other" };
		categoryBox = new JComboBox(valCategory);
		categoryBox.setBounds(300, 190, 400, 30);
		categoryBox.setBackground(Color.WHITE);
		add(categoryBox);

		income = new JLabel("Income : ");
		income.setFont(new Font("Raleway", Font.BOLD, 20));
		income.setBounds(100, 240, 200, 30);
		add(income);

		String valIncome[] = { "NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "10,00,000" };
		incomeBox = new JComboBox(valIncome);
		incomeBox.setBounds(300, 240, 400, 30);
		incomeBox.setBackground(Color.WHITE);
		add(incomeBox);

		educational = new JLabel("Educational : ");
		educational.setFont(new Font("Raleway", Font.BOLD, 20));
		educational.setBounds(100, 290, 200, 30);
		add(educational);

		String valEdu[] = { "Non-Graduate", "Graduate", "Post Graduate", "Doctrate", "Other" };
		educationBox = new JComboBox(valEdu);
		educationBox.setBounds(300, 290, 400, 30);
		educationBox.setBackground(Color.WHITE);
		add(educationBox);

		qualification = new JLabel("Qualification ");
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		qualification.setBounds(100, 320, 200, 30);
		add(qualification);

		occupation = new JLabel("Occupation : ");
		occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		occupation.setBounds(100, 390, 200, 30);
		add(occupation);

		String valOccu[] = { "Salaried", "Self-Employed", "Business", "Student", "Other" };
		occuBox = new JComboBox(valOccu);
		occuBox.setBounds(300, 390, 400, 30);
		occuBox.setBackground(Color.WHITE);
		add(occuBox);

		panNumber = new JLabel("PAN Number : ");
		panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
		panNumber.setBounds(100, 440, 200, 30);
		add(panNumber);

		panTextField = new JTextField();
		panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		panTextField.setBounds(300, 440, 400, 30);
		add(panTextField);

		aadharNo = new JLabel("Aadhar Number : ");
		aadharNo.setFont(new Font("Raleway", Font.BOLD, 20));
		aadharNo.setBounds(100, 490, 200, 30);
		add(aadharNo);

		adhaarTextField = new JTextField();
		adhaarTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		adhaarTextField.setBounds(300, 490, 400, 30);
		add(adhaarTextField);

		citizen = new JLabel("Senior Citizen : ");
		citizen.setFont(new Font("Raleway", Font.BOLD, 20));
		citizen.setBounds(100, 540, 200, 30);
		add(citizen);

		yesSen = new JRadioButton("Yes");
		yesSen.setBounds(300, 540, 60, 30);
		yesSen.setBackground(Color.WHITE);
		add(yesSen);

		noSen = new JRadioButton("No");
		noSen.setBounds(450, 540, 120, 30);
		noSen.setBackground(Color.WHITE);
		add(noSen);

		existsAcc = new JLabel("Exisiting Account : ");
		existsAcc.setFont(new Font("Raleway", Font.BOLD, 20));
		existsAcc.setBounds(100, 590, 200, 30);
		add(existsAcc);

		yesRadioBtn = new JRadioButton("Yes");
		yesRadioBtn.setBounds(300, 590, 60, 30);
		yesRadioBtn.setBackground(Color.WHITE);
		add(yesRadioBtn);

		noRadioBtn = new JRadioButton("No");
		noRadioBtn.setBounds(450, 590, 120, 30);
		noRadioBtn.setBackground(Color.WHITE);
		add(noRadioBtn);

		nextButton = new JButton("Next");
		nextButton.setBackground(Color.BLACK);
		nextButton.setForeground(Color.WHITE);
		nextButton.setFont(new Font("Raleway", Font.BOLD, 14));
		nextButton.setBounds(620, 660, 80, 30);
		nextButton.addActionListener(this);
		add(nextButton);

		getContentPane().setBackground(Color.WHITE);
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);

	}

	public static void main(String[] args) {

		new SignupTwo("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String formno = "" + random; // by putting "" in front and + it returns a String
		String religionString = (String) religionbox.getSelectedItem();
		String categoryString = (String) categoryBox.getSelectedItem();
		String incomeString = (String) incomeBox.getSelectedItem();
		String educatioString = (String) educationBox.getSelectedItem();
		String occupationString = (String) occuBox.getSelectedItem();
		String citizen = null;
		String existsAcc = null;

		if (yesSen.isSelected()) {
			citizen = "Yes";
		} else if (noSen.isSelected()) {
			citizen = "No";
		}

		if (yesRadioBtn.isSelected()) {
			existsAcc = "Yes";
		} else if (noRadioBtn.isSelected()) {
			existsAcc = "No";
		}

		String panNum = panTextField.getText();
		String adhaarNum = adhaarTextField.getText();

		try {
			Conn c = new Conn();
			String query = "insert into signuptwo values('" + formno + "', '" + religionString + "', '" + categoryString + "', '" + incomeString
					+ "', '" + educatioString + "', '" + occupationString + "', '" + panNum + "', '" + adhaarNum + "',  '" + citizen 
					+ "', '" + existsAcc + "')";
			c.s.executeUpdate(query);
			
			new SignupThree(formno).setVisible(true);
			setVisible(false);
		} catch (Exception e2) {
			System.out.println("Exception Occured" + e2);
		}

	}

}
