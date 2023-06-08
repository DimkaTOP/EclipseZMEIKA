package wpo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prog extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog frame = new prog();
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
	public prog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(33, 5, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(127, 8, 149, 16);
		textArea.setColumns(29);
		panel.add(textArea);
		
		JLabel lblNewLabel = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u0432\u043E\u0435 \u0438\u043C\u044F");
		lblNewLabel.setBounds(281, 9, 123, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u041A\u043D\u043E\u043F\u043A\u0430");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(74, 172, 297, 55);
		panel.add(btnNewButton_1);
	}
}
