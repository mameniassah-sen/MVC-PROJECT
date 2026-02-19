package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PersonneForms extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonneForms frame = new PersonneForms();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PersonneForms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NOM");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(28, 63, 49, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("INFORMATION PERSONNEL");
		lblNewLabel.setBounds(129, 11, 222, 20);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("PRENOM");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(29, 104, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("LOGIN");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(28, 142, 68, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("PASSWORD");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(28, 187, 96, 14);
		contentPane.add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(190, 63, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 101, 96, 20);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 142, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(190, 184, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("ENREGISTRER");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(144, 230, 142, 22);
		contentPane.add(btnNewButton);
		

	}
}
