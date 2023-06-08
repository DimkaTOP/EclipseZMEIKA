package zadanka3;

import javax.swing.JOptionPane;

public class zq3 {

	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		boolean y = a>b;
		System.out.println("a>b: " + y);
		boolean i = a<=b;
		System.out.println("a<=b: " + i);
		JOptionPane.showMessageDialog(null,"a>b: false---" + "a<=b: true");
	}

}
