
package electricity.billing.system;

/**
 *
 * @author Prabhu
 */
import java.sql.*;

public class connect {
    
    Connection c;
    Statement s;
      connect(){
//register the driver class  but ab new format me ise likhne ki need nahi
//class.forName("com.mysql.cj.jdbc.Driver");
         
//creating connection 
        try{
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","R@hul123");
             s = c.createStatement();
        }    
        catch(Exception e){
            e.printStackTrace();
        }

      }    
}
