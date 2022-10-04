package JavaClasses;

import java.sql.*;

public class DBConnection 
{
   static final String db_url = "jdbc:mysql://localhost/MedCare";
   static final String userName = "root";
   static final String password = "";
   static Connection conn = null;
    
    public static Connection getconn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db_url,userName,password);
            
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return conn;
    }
}
