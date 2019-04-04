package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame implements ClientUI {

    private static Controller controller;
    private static String title;
    private static int WIDTH;
    private static int HEIGHT;

    private JTextField textField = new JTextField();
    private JPanel panel = new JPanel();
    private JPanel panelAdd = new JPanel();
    private JButton addNew = new JButton("New");
    private JButton addFromDB = new JButton("From DB");
    private JButton calc = new JButton("Calculate");


    private MainWindow() {
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(Toolkit.getDefaultToolkit ().getScreenSize ().width/2-WIDTH/2,
                Toolkit.getDefaultToolkit ().getScreenSize ().height/2-HEIGHT/2, WIDTH, HEIGHT);
        setResizable(true);

        getContentPane().add(textField, BorderLayout.NORTH);
        textField.setText("Для рассчета стоимости полиса добавьте как минимум одного водителя");
        textField.setHorizontalAlignment(JTextField.CENTER);

        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(15, 1, 5, 10));
        panel.add(panelAdd);
        panelAdd.setLayout(new GridLayout(1, 4 ,WIDTH/5, 10));
        panelAdd.add(addNew);
        panelAdd.add(addFromDB);

        getContentPane().add(calc, BorderLayout.SOUTH);

    }
    @Override
    public void showUI() {
        setVisible(true);
    }

    public static WindowBuilder newBuilder(){
        return new MainWindow().new WindowBuilder();
    }

    public class WindowBuilder{
        private WindowBuilder(){

        }

        public WindowBuilder setController(Controller controller){
            MainWindow.this.controller = controller;
            return this;
        }


        public WindowBuilder setTitle(String title){
            MainWindow.this.title = title;
            return this;
        }

        public WindowBuilder setWidth(int width){
            MainWindow.this.WIDTH = width;
            return this;
        }

        public WindowBuilder setHeight(int height){
            MainWindow.this.HEIGHT = height;
            return this;
        }
        public MainWindow build(){
            return new MainWindow();
        }

    }


}
