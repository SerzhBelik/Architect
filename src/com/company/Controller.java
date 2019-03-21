package com.company;

import java.util.List;

public interface Controller {
    Driver requestGetDriver(String licenceNumber);
    boolean requestAddDriver(Driver driver);
    double requestGetPayment(List<Driver> drivers);
    void closeConnection();
    void showUI(ClientUI clientUI);
}
