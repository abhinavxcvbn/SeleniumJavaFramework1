package config;

import java.io.Reader;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
getProperties();
	}
	public static <InputStream> void getProperties()
	{
		try {
		Properties prop=new Properties();
		String projectPath=System.getProperty("user.dir");
		InputStream input = (InputStream) new FileInputStream(projectPath+"/src/test/java/config/config.properties");
prop.load((Reader) input);
	}catch(Exception exp)
	{
		exp.getMessage();
		exp.getCause();
		exp.printStackTrace();
	}
		
	}

}
