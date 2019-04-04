package ru.geekbrains.db_module;

import com.company.drivers.Driver;

import java.sql.*;

public class DriverMapper {
    private final Connection connection;

    public DriverMapper(Connection connection) {
        this.connection  = connection;
    }

    public Driver findByLicenseNumber(String licenseNumber) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM DRIVERS WHERE LICENSENUMBER = ?");
        statement.setString(1,licenseNumber);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Driver driver = new Driver();
                driver.setId(resultSet.getInt(1));
                driver.setFirstName(resultSet.getString(2));
                driver.setLastName(resultSet.getString(3));
                driver.setRegion(resultSet.getString(4));
                driver.setLicenseNumber(resultSet.getString(5));
                return driver;
            }
        }

       return null;
    }

    public boolean insert(Driver driver) {

        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO DRIVERS VALUES (?, ?, ?, ?, ?);");
            ps.setInt(1, driver.getId());
            ps.setString(2, driver.getFirstName());
            ps.setString(3, driver.getLastName());
            ps.setString(4, driver.getRegion());
            ps.setString(5, driver.getLicenseNumber());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void update(Driver person) {
        //FIXME
    }

}

