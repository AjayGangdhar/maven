package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropUtil {

	public static Properties readData(String filename) throws Exception {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Config\\" + filename);

		Properties prop = new Properties();
		prop.load(fis);
		return prop;

	}

}
