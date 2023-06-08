package zmieka;

public class game {

	public int[][]mas;
	public game() {
		mas = new int [30][30];
	}
	
	private void make_new() {
		while(true) {
			int x = (int)(Math.random()*30);
			int y = (int)(Math.random()*30);
			if(mas[y][x]==0) {
				mas[y][x] = -1;
				break;
			}
		}
	}
	
	public void start() {
		for (int i = 0; i<30;i++) {
			for (int j = 0; j<30;j++) {
				mas[i][j]=0;
			}
		}
		
		mas[15][15] = 1;
		
		make_new();
		
	}
	
}
