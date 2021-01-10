public class Pattern1 {

	public static void main(String[] args) {
		//System.out.println("hello");  
		int rows = 5;
		for(int i=rows; i>=1; i--) {
			for(int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=rows; j++) {
				System.out.print(j + " ");
			}
			for(int j=rows-1; j>=i; j--) {
				System.out.print(j+" ");  
			}
			System.out.println();
		}
		
		rows = 5;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=rows; j++) {
				System.out.print(j + " ");
			}
			for(int j=rows-1; j>=i; j--) {
				System.out.print(j+" ");  
			}
			System.out.println();
		}
		
	}
}


