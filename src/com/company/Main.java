package com.company;

public class Main {

    public static void main(String[] args) {

        Controller controller = new ClientController();
        ClientUI clientUI = MainWindow.newBuilder()
                .setController(controller)
                .setHeight(600)
                .setWidth(600)
                .setTitle("Insurance calculate")
                .build();
        controller.showUI(clientUI);
    }
}
