import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.UnaryOperator;

public class Test {

    private static final String URL = "www.baidu.com";
    static Connection newConnection = null;

    public static Connection getDBConnection() throws SQLException {
        String username = "111";
        String password = "222";
        try (Connection con = DriverManager.getConnection(URL, username, password)) {
            newConnection = con;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
             final  String str1 = "Java";
             StringBuffer strBuf = new StringBuffer("Course");
        UnaryOperator<String> u = (str2)-> str1.concat(str2);
                   UnaryOperator<String> c = (str3)-> str3.toLowerCase();
        ////System.out.println(u.apply(c.apply(strBuf)));

    }
}