package ru.geekbrains.calculation_module.handler;

public class CalculateHandler extends Handler {
    @Override
    public void handle(Request request) {
        if(isBusy()) {
            System.out.printf("Оператор %s занят\n");
            super.handle(request);
        }
        else {
            System.out.printf("Оператор %s обрабатывает Request %s\n",
                    request.doSomething());
        }
    }

    private boolean isBusy() {
        return Math.random() < probability;
    }

    // вероятность занятости оператора
    private final double probability = 0.9;

    // ...
}

