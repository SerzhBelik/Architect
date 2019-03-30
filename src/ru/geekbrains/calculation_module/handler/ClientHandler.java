package ru.geekbrains.calculation_module.handler;

public class ClientHandler {
    private Handler handler;

    public ClientHandler() {
        handler = new BusyHandler();

        handler.link(new CalculateHandler())
                .link(new CalculateHandler())
                .link(new CalculateHandler())
                .link(handler);


    }

    public void requestProcess(Request request){
        handler.handle(request);
    }




}
