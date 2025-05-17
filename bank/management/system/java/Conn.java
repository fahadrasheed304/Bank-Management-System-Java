import java.sql.*;
public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:qldeveloper://localhost:3306/bankmanagementsystem", "root","admin");
            s = c.createStatement();
            System.out.println("Connected to database successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }
}