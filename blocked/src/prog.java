import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class prog {

	public static void main(String[] args) {
		okno myOkno = new okno();
	}

}
class okno extends JFrame
{
	private Timer rTimer;
	private JTextArea text;
	private boolean flagExit=false;
	private void setWindow_()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dm = tk.getScreenSize();
		setBounds(0,0,dm.width,dm.height);
		this.setMinimumSize(dm);
		this.setMaximumSize(dm);
		setUndecorated(true);
		this.requestFocus();
		this.setFocusable(true);
		this.toFront();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public okno()
	{
		setContent();
		setWindow_();
	}
	private void setContent()
	{
		Container cont = getContentPane();
		JPanel pan = new JPanel();
		pan.setLayout(null);
		Font labFont1 = new Font("serif",0,40);
		Font labFont2 = new Font("serif",0,20);
		JLabel lab1 = new JLabel("ВАШ КОМПЬЮТЕР ЗАБЛОКИРОВАН!");
		lab1.setForeground(Color.RED);
		lab1.setFont(labFont1);
		lab1.setBounds(50,0,800,100);
		pan.add(lab1);
		JLabel lab2 = new JLabel("Вас приветвует блокировщик Windows!");
		lab2.setForeground(Color.BLUE);
		lab2.setFont(labFont2);
		lab2.setBounds(50,50,800,100);
		pan.add(lab2);
		JLabel lab3 = new JLabel("Ладно!");
		lab2.setForeground(Color.RED);
		lab2.setFont(labFont1);
		lab2.setBounds(50,100,800,100);
		pan.add(lab3);
		
		JLabel lab4 = new JLabel("Для снятия блокировки введите имя:");
		lab2.setForeground(Color.RED);
		lab2.setFont(labFont2);
		lab2.setBounds(50,150,800,100);
		pan.add(lab4);
		
		text = new JTextArea();
		text.setFont(labFont2);
		text.setBounds(50,250,300,35);
		text.setForeground(new Color(0,0,100));
		text.setBackground(Color.WHITE);
		pan.add(text);
		
		JButton btn = new JButton("Введите");
		btn.setSize(150,35);
		btn.setFont(labFont2);
		btn.setLocation(50,300);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = text.getText().toLowerCase().trim();
				String test = (String)"паровозов";
				if (str.equals(test))
				{
					JOptionPane.showMessageDialog(null, "Хорошо!!! Всего доброго Аркадий Паровозов!");
					flagExit=true;
					System.exit(0);
				}
				else
				text.setText("Ответ неудовлетворительный!");
				}});
		pan.add(btn);
		cont.add(pan);
	}
}
