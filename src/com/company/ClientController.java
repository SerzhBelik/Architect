package com.company;

import com.company.drivers.Driver;

import java.util.List;

public class ClientController implements Controller {

    private ClientUI ui;

    public ClientController(){
        initConnection();
    }

    private void initConnection() {
        // FIXME
    }

    @Override
    public Driver requestGetDriver(String licenceNumber) {
        // FIXME
        return null;
    }

    @Override
    public boolean requestAddDriver(Driver driver) {
        // FIXME
        return false;
    }

    @Override
    public double requestGetPayment(List<Driver> drivers) {
        // FIXME
        return 0;
    }

    @Override
    public void closeConnection() {
        //FIXME
    }

    public void showUI(ClientUI ui) {
        this.ui = ui;
        ui.showUI();
    }
}
