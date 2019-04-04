package ru.geekbrains.db_module;

import com.company.drivers.Driver;

import java.util.HashMap;
import java.util.Map;

class UnitOfWork {

    private Map<Integer, Driver> personMap = new HashMap();

    public void addPerson(Driver driver) {

        personMap.put(driver.getId(), driver);
    }

    public Driver getPerson(Integer key) {
        return personMap.get(key);
    }
}

