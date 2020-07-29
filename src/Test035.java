import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Test035 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/flystone";
        String name = "root";
        String password = "";
        try {
            Properties prop = new Properties();
            prop.put("user", name);
            prop.put("password", password);

            Connection conn = DriverManager.getConnection(url, prop);
            Statement st = conn.createStatement();
            String query = "DELETE  FROM employees WHERE EMPLOYEE_ID = 109";
            System.out.println("s" + st.execute(query));
/*            String query = "Select * FROM employees WHERE EMPLOYEE_ID = 110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID:" + rs.getObject(1));//rs.getInt("Id")
            }
            // System.out.println("ID:" + rs.getInt("EMPLOYEE_ID"));//rs.getInt("Id")*/
        } catch (SQLException se) {
            System.out.println("Error");
        }
    }
}

