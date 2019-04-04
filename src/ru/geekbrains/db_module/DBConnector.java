package ru.geekbrains.db_module;

import java.sql.*;

import com.company.drivers.Driver;
import org.sqlite.JDBC;


public class DBConnector {
    Connection connection = null;
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
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Driver getDriver(String licenseNumber){
        DriverMapper driverMapper = new DriverMapper(connection);
        try {
            Driver driver = driverMapper.findByLicenseNumber(licenseNumber);
            return  driver;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public boolean setDriver(Driver driver){
        DriverMapper driverMapper = new DriverMapper(connection);
        if (driverMapper.insert(driver)) return true;
        else return false;
    }




}
