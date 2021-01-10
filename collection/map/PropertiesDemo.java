import java.util.*;
import java.io.*;
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream("abc.properties");
			p.load(fis);
			System.out.println(p.getProperty("venki"));
			p.setProperty("nag", "8888");
			// updating abc.properties file
			// FileOutputStream fos = new FileOutputStream("abc.properties");
			// p.save(fos, "updated by Sushil");
			Set<String> keys = p.stringPropertyNames();
			for (String key : keys) {
				System.out.println(key + " : " + p.getProperty(key));
			}

		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		
	}
}