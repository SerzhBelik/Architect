package ru.geekbrains.calculation_module.handler;

public class BusyHandler extends Handler {
    private Request request;

    @Override
    public void handle(Request request) {
        if(this.request == request)
            System.out.println("Все операторы заняты, пожалуйста подождите");
        else
            this.request = request;

        super.handle(request);
    }

}

