package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoi {
    public static Connection ketNoi() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom8","root","");
        return con;
    }
}
