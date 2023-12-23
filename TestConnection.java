package com.java.jailbreak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConnection {
	public static Connection createConnection() throws FileNotFoundException,IOException 
	{	Connection connection = null;
		try {
			//Load the properties file
			Properties properties = new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\HP\\intro\\JavaPractice\\JailBreak\\connection-info.properties");
			properties.load(fis);
		
			//Get the data from properties file 
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName(properties.getProperty("Driver"));
			
			connection = DriverManager.getConnection(properties.getProperty("Url"),properties.getProperty("Username"),properties.getProperty("Password"));
		//connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Welcome");
		System.out.println("connection created");
		
		}
		catch(ClassNotFoundException| SQLException e)
		{	e.printStackTrace();
			
		}
		return connection;

}
}
