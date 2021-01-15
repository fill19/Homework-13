package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {

        private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&serverTimezone=UTC";
        private static final String USER = "root";
        private static final String PASSWORD = "Fill123456";

        public static Connection getConnection() throws ClassNotFoundException, SQLException {
            Class.forName(MYSQL_DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }

