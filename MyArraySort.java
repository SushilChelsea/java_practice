public class MyArraySort {
	public static void main(String[] args) {
		int[] intArr = {2, 7, 1, 4, 8, 3, 5, 9, 2, 7, 1, 4, 8, 3, 5, 9, 3, 3};
		for(int a: intArr) {
			System.out.print(a + " ");
		}
		System.out.println();
		// sorting array
		for(int i=0; i<intArr.length-1; i++) {
			for(int j=i+1; j<intArr.length; j++) {
				if(intArr[j] < intArr[i]){
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}	
			}
		}

		for(int a: intArr) {
			System.out.print(a + " ");
		}

		//removing duplication
		//create new array to store non duplicate element from original array
		int[] newArr = new int[intArr.length];
		int index = 0;
		int i=1;
		for(; i<intArr.length; i++) {
			if(intArr[i] == intArr[i-1]) {
				continue;
			}
			newArr[index] = intArr[i-1]; 
			index++;
			//System.out.println(i);
		}
		//System.out.println(intArr[i-1]);
		for(int j=0; j<newArr.length; j++) {
			if(intArr[i-1] != newArr[j]) {
				newArr[index] = intArr[i-1];
			}
		}
		System.out.println();
		System.out.println("Duplicate Removed");
		for(int a: newArr) {
			if(a != 0) {
				System.out.print(a + " ");
			}
		}
	}
}