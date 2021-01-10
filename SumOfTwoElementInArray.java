import java.util.Arrays;
import java.util.Scanner;
public class SumOfTwoElementInArray {
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter the sum of Two Element and I'll find it's Index: ");
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		int[] indices = new int[2];
		indices = findSum(arr,target);
		for (int i : indices) {
			System.out.print(i + " ");
		}

	}
	public static int[] findSum(int[] arr, int target) {
		int[] indices = new int[2];
		boolean found = false;
		int el1=0, el2=0;
		if(arr.length > 1) {
			for (int i=0;i<arr.length-1;i++) {
				for (int j=i+1;j<arr.length;j++) {
					if (arr[i] + arr[j] == target) {
						el1=i; el2=j;
						found = true;
						break;
					}
				}
				if(found == true) {
					indices[0]=el1;
					indices[1]=el2;
					break;
				}
				
			}
		}		
		return indices;
	}
}