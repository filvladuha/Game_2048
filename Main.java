package com.company;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        JFrame window = new JFrame("2048"); //класс для создания окон приложения
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(game);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        game.start(); // создаёт новый поток и берёт код из метода run и запускает его новом потоке.Поток main и поток Thread
    }
}