package lesson_26;

import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by java2 on 28.09.17.
 */
public class H2Sample {

//    // JDBC driver name and database URL
//    static final String JDBC_DRIVER = "org.h2.Driver";
 //   static final String DB_URL = "jdbc:h2:~/test";
//
//    //  Database credentials
//    static final String USER = "username";
//    static final String PASS = "password";

    public static void main(String[] args) {

//        Connection conn = null;
//        Statement stmt = null;

        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setUrl("jdbc:h2:~/test2");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE STUDENTS(ID INT PRIMARY KEY, name VARCHAR(50) NOT NULL, lastName VARCHAR(50) NOT NULL,)");

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();

        }
    }
}

