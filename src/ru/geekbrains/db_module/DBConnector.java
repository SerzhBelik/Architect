package ru.geekbrains.db_module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.sqlite.JDBC;


public class DBConnector {
    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    String prefix = JDBC.PREFIX;

    public DBConnector(){
        try {
            connection = DriverManager.getConnection(prefix + "D:\\test.db");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
//                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



}
