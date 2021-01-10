public class Test {

	public static void main(String[] args) {
		/*
		int counter = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				counter += 1;
				System.out.print(counter + " ");
			}
			System.out.println();
		}
		*/
		/*
		for(int i=1; i<=5; i++) {
			int j=1;
			for(; j<=i; j++) {
				System.out.print(j + " ");
			}
			int k=j-1;
			for(; k>1; j--) {
				System.out.print(--k + " ");
			}
			System.out.println();
		}
		*/

		for(int i=5; i>=1; i--) {
			//Printing i*2 spaces at the beginning of each row 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
			//Printing j where j value will be from i to noOfRows
            for (int j = i; j <= 5; j++)          
            {
                System.out.print(j+" ");
            }
			//Printing j where j value will be from noOfRows-1 to i             
            for (int j = 5-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }
			System.out.println();

		}
		
	}
}


