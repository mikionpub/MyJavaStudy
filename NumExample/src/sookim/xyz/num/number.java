package sookim.xyz.num;

public class number {
	
	private int x;
	private int[] y;
	
	public int x() {
		return x;
	}
	
	public int[] gety() {
		return y;
	}
	
	public void setx(int x) {
		this.x = x;
	}
	
	public void sety(int[] y) {
		this.y = y;
	}

	public int avg(int x, int[] y) {
		
		int a;
		int sum = 0;
		
		for(int i=0; i<this.x(); i++) {
			sum += this.y[i];
			i++;
		}
		
		a = sum / x;
		
		return a;
		
	}

	public int[] sort(int x, int[] y) {
		
		int temp;
		
		for (int i=0; i<this.x()-1; i++) {
			if(y[i]>y[i+1]) {
				temp = this.y[i];
				this.y[i] = this.y[i+1];
				this.y[i+1] = temp;
			}
		for(int e: y) {
			System.out.println(e+" ");
		}
			
		}
		
		return y;
		
	}	

}
