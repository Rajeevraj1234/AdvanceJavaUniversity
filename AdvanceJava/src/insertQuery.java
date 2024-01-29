import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insertQuery {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceJava","root","rajeevIsGod");
            Statement st = con.createStatement();
            int rowAffected = st.executeUpdate("insert into student values(3,'zoro','m')");

            System.out.println(rowAffected+" rows Affected");
            st.close();
            con.close();

        }catch(Exception e){
            System.out.println("error"+e);
        }
    }
}
