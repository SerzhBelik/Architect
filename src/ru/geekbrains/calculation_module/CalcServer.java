package ru.geekbrains.calculation_module;


import ru.geekbrains.calculation_module.handler.ClientHandler;
import ru.geekbrains.calculation_module.handler.Request;

public class CalcServer {

    private static ClientHandler clientHandler;
    private static Request request;

    public static void main(String[] args) {
        start();
        Thread myTread = new Thread(new Runnable() {
            @Override
            public void run() {
                requestListing();
            }
        });
        

    }

    private static void requestListing() {
        while (true){
            if (isRequest()) clientHandler.requestProcess(request);

        }
    }

    private static boolean isRequest() {
        // метод проверяет есть ли запрос от клиента
        request = null;
        return false;
    }

    private static void start(){
        System.out.println("Server is started!");
        clientHandler = new ClientHandler();
    }


}
