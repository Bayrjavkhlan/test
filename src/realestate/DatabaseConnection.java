package realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/YourDatabaseName";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "20030628";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

public void performDatabaseOperations(JLabel label) {
    try {
        String query = "SELECT COUNT(text1) AS count FROM test";
        PreparedStatement statement = getConnection().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int count = resultSet.getInt("count");
            label.setText("Count: " + count);
        }

        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


}
