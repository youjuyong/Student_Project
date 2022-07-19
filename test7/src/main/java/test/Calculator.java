package test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class Calculator {

	    private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	    private static final String URL ="jdbc:oracle:thin:@:1521:JCPDEV"; 
	    private static final String USER ="jcpdev";
	    private static final String PW ="1234";
	    
	    @Test
	    public void testConnect() throws Exception{
	        
	        Class.forName(DRIVER);
	        
	        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
	            
	            System.out.println(con);
	        }catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
}
