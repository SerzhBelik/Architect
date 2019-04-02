package ru.geekbrains.db_module;


import com.company.drivers.Driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverMapper {
    private final Connection connection;

    public DriverMapper(Connection connection) {
        this.connection  = connection;
    }

    public Driver findById(int idPerson) throws SQLException, RecordNotFoundException{
        PreparedStatement statement = connection.prepareStatement(
                "SELECT IDPERSON, FIRSTNAME, LASTNAME FROM PERSON WHERE IDPERSON = ?");
        statement.setInt(1,idPerson);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Driver driver = new Driver();
                person.setIdPerson(resultSet.getInt(1));
                person.setFirstName(resultSet.getString(2));
                person.setLastName(resultSet.getString(3));
                return person;
            }
        }

        throw new RecordNotFoundException(idPerson);
    }

    public void insert(Person person) {
        // схожее использование методов чистого JDBC, тело опущено
    }

    public void update(Person person) {
        // схожее использование методов чистого JDBC, тело опущено
    }

    public void delete(Person person) {
        // схожее использование методов чистого JDBC, тело опущено
    }
}

