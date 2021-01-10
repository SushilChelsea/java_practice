import java.io.*;

public class Test {
	public static void main(String[] args) {
		/*
		//read file using BufferedReader
		BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
		
		//temporary string holding variable
		String s;
		
		//read file line at a time until it reaches null
		while((s=br.readLine()) != null) {
			System.out.println(s);
		}
		*/
		
		
		try {
			//read file using BufferedReader
			BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
			
			//temporary string holding variable
			String s;
			
			//read file line at a time until it reaches null
			while((s=br.readLine()) != null) {
				//System.out.println(s);
				//String csv = s.replace("|", ",");
				
				String[] sArray = s.split("|");
				System.out.println(sArray.length);
				
				//for(String str: sArray) {
				//	System.out.print(str);
				//}
				System.out.println();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}