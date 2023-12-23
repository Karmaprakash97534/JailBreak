package com.java.jailbreak;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriminalDao {
	public static int saveData(UserData user) {
		int res=0;
        try {
        	 Connection connection = TestConnection.createConnection();
        	 PreparedStatement preparedStatement = connection.prepareStatement("insert into Criminal_Record values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                //Set the data
        	 preparedStatement.setString(1,user.getUsername());
        	 preparedStatement.setString(2,user.getFullname());
        	
        	 
        	 preparedStatement.setString(3,user.getAge());
        	 preparedStatement.setString(4,user.getGender());
        	 preparedStatement.setString(5,user.getEducation());
             preparedStatement.setString(6,user.getFulladdress());
        	
             
             preparedStatement.setString(7,user.getNoofcase());
        	 preparedStatement.setString(8,user.getIpcsection());
        	 preparedStatement.setString(9,user.getCrimeinfo());
        	 preparedStatement.setString(10,user.getActivecase());
        	 preparedStatement.setString(11,user.getPendingcase());
        	
        	 
        	 preparedStatement.setString(12,user.getJailname());
        	 preparedStatement.setString(13,user.getEntrydate());
        	 preparedStatement.setString(14,user.getExitdate());
        	 preparedStatement.setString(15,user.getMettingdate());
        	 res = preparedStatement.executeUpdate();
        	 System.out.println(res);
        
        
        
        }
        catch( SQLException |IOException e) {
        	e.printStackTrace();
        }
        
        return res;
	}
}
