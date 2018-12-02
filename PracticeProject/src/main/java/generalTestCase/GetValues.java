package generalTestCase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetValues {
	
	public static Properties prop;
	
	public static String getValue(String name) {
		try {
			// File Path
			File path = new File("./src/main/resources/validations.properties");
			// Read File
			FileInputStream fin = new FileInputStream(path);
			// create object for properties
			prop = new Properties();
			// load data into prop
			prop.load(fin);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(name);
	}
}
