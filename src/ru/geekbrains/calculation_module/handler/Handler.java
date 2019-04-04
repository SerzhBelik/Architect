package ru.geekbrains.calculation_module.handler;

public abstract class Handler {
    private Handler next;

    public void handle(Request request) {
        if(next != null)
            next.handle(request);
    }

    Handler link(Handler next) {
        this.next = next;
        return next;
    }
}
