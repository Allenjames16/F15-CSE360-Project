import javax.swing.JApplet;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class UserAccountRegistration extends JDialog{
	private JTextField userName;
	private JTextField password;
	private JTextField confirmPassword;
	private JTextField email;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField dobMonth;
	private JTextField dobDay;
	private JTextField dobYear;
	private JLabel lblGender;
	private JTextField currentAddress;
	private JTextField sSN;
	private JTextField emergencyContactName;
	private JTextField emergencyContactRelationship;
	private JTextField emergencyContactPhone;
	private JTextField insuranceName;
	private JTextField insuranceAddress;
	private JTextField policyNumber;
	private JTextField groupNumber;
	private JTextField effectiveMonth;
	private JTextField effectiveDay;
	private JTextField effectiveYear;
	private JTextField policyHolder;
	private JTextField cellPhone;
	private JTextField workPhone;
	private JTextField city;
	private JTextField state;

	/**
	 * Create the applet.
	 */
	public UserAccountRegistration() {
		setTitle("User Account Registration");
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("User Name");
		label.setBounds(10, 32, 70, 14);
		getContentPane().add(label);
		
		userName = new JTextField();
		userName.setColumns(10);
		userName.setBounds(107, 29, 148, 20);
		getContentPane().add(userName);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(107, 60, 148, 20);
		getContentPane().add(password);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(10, 63, 46, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Confirm Password");
		label_2.setBounds(10, 94, 106, 14);
		getContentPane().add(label_2);
		
		confirmPassword = new JTextField();
		confirmPassword.setColumns(10);
		confirmPassword.setBounds(107, 91, 148, 20);
		getContentPane().add(confirmPassword);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(107, 122, 148, 20);
		getContentPane().add(email);
		
		JLabel label_3 = new JLabel("Email");
		label_3.setBounds(10, 125, 46, 14);
		getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("Account Info");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 7, 106, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPersonalInformation.setBounds(10, 153, 148, 14);
		getContentPane().add(lblPersonalInformation);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 181, 70, 14);
		getContentPane().add(lblFirstName);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(107, 178, 148, 20);
		getContentPane().add(firstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 209, 70, 14);
		getContentPane().add(lblLastName);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(107, 206, 148, 20);
		getContentPane().add(lastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(10, 237, 70, 14);
		getContentPane().add(lblDateOfBirth);
		
		dobMonth = new JTextField();
		dobMonth.setColumns(2);
		dobMonth.setBounds(107, 234, 30, 20);
		getContentPane().add(dobMonth);
		
		dobDay = new JTextField();
		dobDay.setColumns(2);
		dobDay.setBounds(147, 234, 30, 20);
		getContentPane().add(dobDay);
		
		dobYear = new JTextField();
		dobYear.setColumns(2);
		dobYear.setBounds(195, 234, 60, 20);
		getContentPane().add(dobYear);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 262, 70, 14);
		getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(107, 261, 85, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(107, 287, 109, 23);
		getContentPane().add(rdbtnFemale);
		
		JLabel lblMaritalStatus = new JLabel("Marital Status");
		lblMaritalStatus.setBounds(10, 321, 78, 14);
		getContentPane().add(lblMaritalStatus);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Single", "Married", "Divorced"}));
		comboBox.setBounds(107, 317, 148, 20);
		getContentPane().add(comboBox);
		
		JLabel lblCurrentAddress = new JLabel("Current Address");
		lblCurrentAddress.setBounds(10, 354, 92, 14);
		getContentPane().add(lblCurrentAddress);
		
		currentAddress = new JTextField();
		currentAddress.setBounds(107, 351, 148, 20);
		getContentPane().add(currentAddress);
		currentAddress.setColumns(10);
		
		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(10, 453, 46, 14);
		getContentPane().add(lblSsn);
		
		sSN = new JTextField();
		sSN.setBounds(107, 450, 148, 20);
		getContentPane().add(sSN);
		sSN.setColumns(10);
		
		JLabel label_4 = new JLabel("Emergency Contact Information");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(312, 122, 226, 14);
		getContentPane().add(label_4);
		
		emergencyContactName = new JTextField();
		emergencyContactName.setColumns(10);
		emergencyContactName.setBounds(407, 144, 148, 20);
		getContentPane().add(emergencyContactName);
		
		JLabel label_5 = new JLabel("Name");
		label_5.setBounds(312, 147, 70, 14);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Relationship");
		label_6.setBounds(312, 178, 70, 14);
		getContentPane().add(label_6);
		
		emergencyContactRelationship = new JTextField();
		emergencyContactRelationship.setColumns(10);
		emergencyContactRelationship.setBounds(407, 175, 148, 20);
		getContentPane().add(emergencyContactRelationship);
		
		emergencyContactPhone = new JTextField();
		emergencyContactPhone.setColumns(10);
		emergencyContactPhone.setBounds(407, 209, 148, 20);
		getContentPane().add(emergencyContactPhone);
		
		JLabel label_7 = new JLabel("Phone");
		label_7.setBounds(312, 212, 70, 14);
		getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Primary Insurance Information");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(312, 237, 226, 14);
		getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Name");
		label_9.setBounds(312, 268, 70, 14);
		getContentPane().add(label_9);
		
		insuranceName = new JTextField();
		insuranceName.setColumns(10);
		insuranceName.setBounds(407, 265, 148, 20);
		getContentPane().add(insuranceName);
		
		insuranceAddress = new JTextField();
		insuranceAddress.setColumns(10);
		insuranceAddress.setBounds(407, 296, 148, 20);
		getContentPane().add(insuranceAddress);
		
		JLabel label_10 = new JLabel("Address");
		label_10.setBounds(312, 299, 70, 14);
		getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Policy Number");
		label_11.setBounds(312, 327, 70, 14);
		getContentPane().add(label_11);
		
		policyNumber = new JTextField();
		policyNumber.setColumns(10);
		policyNumber.setBounds(407, 324, 148, 20);
		getContentPane().add(policyNumber);
		
		JLabel label_12 = new JLabel("Group Number");
		label_12.setBounds(312, 359, 70, 14);
		getContentPane().add(label_12);
		
		groupNumber = new JTextField();
		groupNumber.setColumns(10);
		groupNumber.setBounds(407, 356, 148, 20);
		getContentPane().add(groupNumber);
		
		JLabel label_13 = new JLabel("Effective Date");
		label_13.setBounds(312, 387, 70, 14);
		getContentPane().add(label_13);
		
		effectiveMonth = new JTextField();
		effectiveMonth.setColumns(2);
		effectiveMonth.setBounds(407, 384, 30, 20);
		getContentPane().add(effectiveMonth);
		
		effectiveDay = new JTextField();
		effectiveDay.setColumns(2);
		effectiveDay.setBounds(447, 384, 30, 20);
		getContentPane().add(effectiveDay);
		
		effectiveYear = new JTextField();
		effectiveYear.setColumns(2);
		effectiveYear.setBounds(495, 384, 60, 20);
		getContentPane().add(effectiveYear);
		
		policyHolder = new JTextField();
		policyHolder.setColumns(10);
		policyHolder.setBounds(407, 415, 148, 20);
		getContentPane().add(policyHolder);
		
		JLabel label_14 = new JLabel("Policy Holder");
		label_14.setBounds(312, 418, 70, 14);
		getContentPane().add(label_14);
		
		cellPhone = new JTextField();
		cellPhone.setColumns(10);
		cellPhone.setBounds(410, 55, 148, 20);
		getContentPane().add(cellPhone);
		
		workPhone = new JTextField();
		workPhone.setColumns(10);
		workPhone.setBounds(410, 24, 148, 20);
		getContentPane().add(workPhone);
		
		JLabel label_15 = new JLabel("Work Phone");
		label_15.setBounds(313, 27, 78, 14);
		getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("Cell Phone");
		label_16.setBounds(313, 58, 60, 14);
		getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("Allow SMS");
		label_17.setBounds(312, 92, 70, 14);
		getContentPane().add(label_17);
		
		JRadioButton radioButton = new JRadioButton("Yes");
		radioButton.setBounds(410, 88, 51, 23);
		getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(463, 88, 56, 23);
		getContentPane().add(radioButton_1);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 385, 92, 14);
		getContentPane().add(lblCity);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(107, 382, 148, 20);
		getContentPane().add(city);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(10, 418, 92, 14);
		getContentPane().add(lblState);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(107, 415, 148, 20);
		getContentPane().add(state);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(466, 449, 89, 23);
		getContentPane().add(btnSubmit);
		
	}
}