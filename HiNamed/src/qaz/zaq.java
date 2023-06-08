package qaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class zaq extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zaq frame = new zaq();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public zaq() {
		setTitle("Mоё окно");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Вход");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().trim();
				if (str.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Введите имя!");
				}
				else
					JOptionPane.showMessageDialog(null, "Привет! "+str);
			}
		});
		btnNewButton.setBounds(0, 60, 89, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Введите имя: ");
		lblNewLabel.setBounds(151, 38, 80, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(237, 35, 174, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton_2 = new JButton("Настройки");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(0, 96, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Выход");
		btnNewButton_3.setBounds(0, 130, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Extreme mod");
		rdbtnNewRadioButton.setBounds(0, 196, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
	}
}
