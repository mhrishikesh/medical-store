package medicalstore;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conn {
    public static Connection conLink(){
        Connection con=null;
        try{    
         Class.forName("oracle.jdbc.OracleDriver");
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","medical","store");
         }
         catch(Exception e){
           JOptionPane.showMessageDialog(null,"Hello","connection problem",JOptionPane.ERROR_MESSAGE);
         }    
        return(con);   
    }
}    
