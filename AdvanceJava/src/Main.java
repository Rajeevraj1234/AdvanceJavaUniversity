import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceJava","root","rajeevIsGod");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from student");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }
    }
}