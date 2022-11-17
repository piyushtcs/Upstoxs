package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	Properties pro=new Properties();
	public ReadConfig() throws Throwable{
	FileInputStream fis =new FileInputStream("C:\\Users\\Sweety\\eclipse-workspace\\Upstocks\\config.properties");
	pro.load(fis);
	}
	
	public  String getUsername() {
		String un=pro.getProperty("username");
		return un;
	}
	public  String getPassword() {
		String un=pro.getProperty("password");
		return un;
	}
	public  String getdob() {
		String un=pro.getProperty("dob");
		return un;
	}
	
	
	
	
}
