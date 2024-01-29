import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updateQuery {
    public static void main(String[] args) {
//        "update student set gender = 'f' where id = 3"
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceJava","root","rajeevIsGod");
            Statement st = con.createStatement();
            int rowAffected = st.executeUpdate("update student set s_name = 'roronoa zoro' where s_id = 3");

            System.out.println(rowAffected+" rows Affected");
            st.close();
            con.close();

        }catch(Exception e){
            System.out.println("error"+e);
        }
    }
}
