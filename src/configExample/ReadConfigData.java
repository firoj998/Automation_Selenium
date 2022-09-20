package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigData {

	Properties prop;

	public ReadConfigData() throws IOException {

		FileInputStream fis = new FileInputStream("./testData\\config.properties");

		prop = new Properties();
		prop.load(fis);

	}

	public String getApplicationURL_QA() {

		String appURL = prop.getProperty("appURL_QA");
		return appURL;
	}

	public String getUserName() {

		return prop.getProperty("adminUser");
	}
	
	public String getPass() {

		return prop.getProperty("adminPass");
	}

}
