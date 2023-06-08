package progekt7;

public class pio7 {

	public static void main(String[] args) {
		int val = 0;
		try
		{
			val = val/0;
		}
		catch(Exception ex) {
			System.out.println("An error has occurred");
		}

	}

}
