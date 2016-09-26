package stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Clob;
// Example Java Program - Oracle Database Connectivity
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

public class AsciiStreamTest {
	
	public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:ldbmain";
    public static final String DBUSER = "build";
    public static final String DBPASS = "build";
    
    
    

    public static void main(String[] args) throws SQLException, IOException {
    	
    	TimeZone timeZone = TimeZone.getTimeZone("GMT+5.30");
        TimeZone.setDefault(timeZone);
        
        // Load Oracle JDBC Driver
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        
        // Connect to Oracle Database
        Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

        Statement statement = con.createStatement();

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values
        // Enables us to retrieve values as if querying from a table
        ResultSet rs = statement.executeQuery("SELECT * from build.clobtest");
        
        
        if (rs.next()) {
            Clob clob = rs.getClob(1); // get first column returned
            InputStream is = clob.getAsciiStream();
            InputStreamReader insr = new InputStreamReader(is);
            char[] cbuf = new char[20];
            int c;
            while ((c = insr.read(cbuf)) != -1) {
                System.out.println(cbuf);
            }
        }
        rs.close();
        statement.close();
        con.close();
    }
}