
public class game {
	
	public int[][]masPlay;
	public int[][]masComp;
	
	public boolean compHod;
	public int endg;
	
	public game() {
		masPlay = new int [10][10];
		masComp = new int [10][10];
	}
	
	public void start() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				masPlay[i][j]=0;
				masComp[i][j]=0;
			}
		}
		endg=0;
		compHod = false;
		rassttanovkaKorabley(masPlay);
		rassttanovkaKorabley(masComp);
	}
	private void rassttanovkaKorabley(int[][]mas) {
		make4P(mas,4);
		for(int i=1;i<=2;i++) 
			make4P(mas,3);
			for(int i=1;i<=3;i++) 
				make4P(mas,2);
				make1P(mas);
			
		}
	private void make4P(int[][]mas,int kolPaluba) {
		while(true) {
			boolean flag = false;
			int i=0,j=0;
			i = (int)(Math.random()*10);
			j = (int)(Math.random()*10);
			
			int napr = (int)(Math.random()*4);
			if(testNewPaluba(mas,i,j)==true) {
				if(napr==0) {
					if(testNewPaluba(mas,i,j+(kolPaluba-1))==true)
						flag=true;
				}
				else if(napr==2) {
					if(testNewPaluba(mas,i+(kolPaluba-1),j)==true)
						flag = true;
				}
				else if(napr==3) {
					if(testNewPaluba(mas,i,j+(kolPaluba-1))==true)
						flag = true;
				}
			}
			if(flag==true) {
				mas[i][j]=kolPaluba;
				
				okrBegin(mas,i,j,-2);
				
				if(napr==0) {
					for(int k=kolPaluba-1;k>=1;k--) {
						mas[i-k][j]= kolPaluba;
						okrBegin(mas,i-k,j,-2);
					}
				}
				else if(napr==1) {
					for(int k=kolPaluba-1;k>=1;k--) {
						mas[i][j+k]=kolPaluba;
						okrBegin(mas,i,j+k,-2);
					}
				}
				else if(napr==2) {
					for(int k=kolPaluba-1;k>=1;k--) {
						mas[i+k][j]= kolPaluba;
						okrBegin(mas,i+k,j,-2);
					}
				}
				break;
			}
		}
		okrEnd(mas);
	}
	public void vistrelPlay(int i,int j) {
		
	}
	
}
