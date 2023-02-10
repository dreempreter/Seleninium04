package elionpractices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	public static Properties prop;
	/**
	 * This method will read the properties file
	 * @param filePath
	 */
	public static void readProperties(String filePath) {
	
		try {
			FileInputStream fis = new FileInputStream(filePath);
			 prop = new Properties();
			try {
				prop.load(fis);
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	/**
	 * This method will return the value for a specific key
	 * @param String key
	 * @return String value
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key);
		
	}
	
	
	
}
