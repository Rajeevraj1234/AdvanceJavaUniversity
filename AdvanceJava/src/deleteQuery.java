import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deleteQuery {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceJava","root","rajeevIsGod");
            Statement st = con.createStatement();
            int rowAffected = st.executeUpdate("delete from student where s_id=3 ");

            System.out.println("Deleted Successfully");
            st.close();
            con.close();

        }catch(Exception e){
            System.out.println("error"+e);
        }
    }
}
