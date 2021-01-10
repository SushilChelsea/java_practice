import java.io.*;
import java.util.*;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("abc.properties");
		Properties properties = new Properties();
		properties.load(fis);

		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));

	}
}