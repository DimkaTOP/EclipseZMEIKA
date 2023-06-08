package zad9;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;

public class qw1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFile;
	private JTextArea textArea;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qw1 frame = new qw1();
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
	public qw1() {
		setBackground(new Color(102, 0, 0));
		setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		setForeground(Color.RED);
		setTitle("Операции для роботы с файлами.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 541);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonNovie = new JButton("Cоздать новый");
		buttonNovie.setForeground(Color.BLACK);
		buttonNovie.setBackground(new Color(255, 255, 153));
		buttonNovie.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 11));
		buttonNovie.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent e) {
				String str = textFieldFile.getText().trim();
				if(str.isEmpty()) 
				{
					OptionPane.showMessageDialog(null, "Введите путь к файлу!", "Ошибка", 0);
				}
				else
				{
					File nf = new File(str);
					try
					{
						nf.createNewFile();
						JOptionPane.showMessageDialog(null, "Файл создан!", "Сообщение",1);
					}
					catch(IOException exp)
					{
						JOptionPane.showMessageDialog(null, "Файл не создан!", "Ошибка", 0);
					}
				}
			}});
		buttonNovie.setBounds(29, 129, 143, 50);
		contentPane.add(buttonNovie);
		
		JButton buttonUdalit = new JButton("Удалить");
		buttonUdalit.setBackground(new Color(0, 102, 51));
		buttonUdalit.setForeground(Color.DARK_GRAY);
		buttonUdalit.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 12));
		buttonUdalit.setBounds(29, 190, 143, 50);
		contentPane.add(buttonUdalit);
		
		JButton buttonPereim = new JButton("Переименовать");
		buttonPereim.setBackground(new Color(255, 0, 153));
		buttonPereim.setForeground(Color.DARK_GRAY);
		buttonPereim.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 11));
		buttonPereim.setBounds(29, 251, 143, 50);
		contentPane.add(buttonPereim);
		
		JButton buttonZap = new JButton("Прочитать");
		buttonZap.setBackground(new Color(153, 255, 102));
		buttonZap.setForeground(Color.DARK_GRAY);
		buttonZap.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 11));
		buttonZap.setBounds(29, 313, 143, 50);
		contentPane.add(buttonZap);
		
		JButton buttonProch = new JButton("Записать");
		buttonProch.setBackground(new Color(204, 255, 102));
		buttonProch.setForeground(Color.DARK_GRAY);
		buttonProch.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 11));
		buttonProch.setBounds(29, 379, 143, 50);
		contentPane.add(buttonProch);
		
		JLabel btnPro = new JLabel("Укажите путь к файлу: ");
		btnPro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnPro.setBounds(30, 64, 173, 40);
		contentPane.add(btnPro);
		
		textFieldFile = new JTextField();
		textFieldFile.setBounds(240, 72, 467, 28);
		contentPane.add(textFieldFile);
		textFieldFile.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(240, 129, 523, 330);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textArea.setBackground(new Color(153, 51, 255));
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Mistral", Font.BOLD | Font.ITALIC, 14));
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(0, 51, 255));
		passwordField.setBounds(29, 463, 174, 28);
		contentPane.add(passwordField);
	}
}
