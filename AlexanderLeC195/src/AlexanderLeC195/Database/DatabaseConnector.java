package AlexanderLeC195.Database;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class DatabaseConnector {
    // JDBC Parts
    private static final String protocol = "jdbc";
    private static final String vendor = ":mysql:";
    private static final String ServerName = "//3.227.166.251/WJ062Su";

    // JDBC URL
    private static final String jdbcURL = protocol + vendor + ServerName;

    // DB User Info
    private static final String Username = "U062Su";
    private static final String Password = "53688675251";

    // Driver & Connection Interface
    private static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    public static Connection connection;

    public static Connection connectDatabase() {
        try {
            Class.forName(jdbcDriver);
            connection = (Connection) DriverManager.getConnection(jdbcURL, Username, Password);
            System.out.println("Connected to database.");
        }
        catch (ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
        catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }

        return connection;
    }

    public static void disconnectDatabase() {
        try {
            connection.close();
            System.out.println("Disconnected from database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
