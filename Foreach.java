public class Foreach {
	public static void main(String[] args) {
		int [][]x = {	{5,6,7},
						{8,9}
					};

		for (int[] x1 : x) {
			System.out.print("{ ");
			for (int x2 : x1) {
				System.out.print(x2+" ");
			}
			System.out.print("}");
			System.out.println();
		}
	}
}