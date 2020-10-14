package propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class confiqReader {
	public static Properties prop = null;

	public confiqReader() {
	}

	public static void property() throws IOException {
		String s = "D:\\yuvasri_revision\\AmazonMobilePhones\\src" 
	+ "\\main\\java\\propertyFile\\Amazon.properties";
		FileInputStream f = new FileInputStream(s);
    
		prop = new Properties();
		prop.load(f);
         
	}

	public static String getUrl() throws IOException {
    property();
		String url = prop.getProperty("url");
		return url;
	}

	public  static String getBrowserName() throws IOException {
		  property();
		String browserName = prop.getProperty("browserName");
		//System.out.println(browserName);
		return browserName;
	}

}
