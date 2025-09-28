package scripts;

import java.util.Properties;

import utilities.PropUtil;

public class PropTest {

	public static void main(String[] args) throws Exception {

		Properties data = PropUtil.readData("Config.properties");
		System.out.println(data.getProperty("APP_URL"));
		System.out.println(data.getProperty("USERNAME"));

	}

}
