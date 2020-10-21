package com.gui.ru;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow(){
//        Настройка отображения
        setTitle("Калькулятор"); // Заголовок
        setLocation(650, 650); // Локация для отображения
        setSize(350, 450); // Размера окошка
        setResizable(false); // Запретить изменять размер окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Завершить программу по нажатию на крестик

//        Добавляем кнопочки
        JButton buttonClick0 = new JButton("0");
        JButton buttonClick1 = new JButton("1");
        JButton buttonClick2 = new JButton("2");
        JButton buttonClick3 = new JButton("3");
        JButton buttonClick4 = new JButton("4");
        JButton buttonClick5 = new JButton("5");
        JButton buttonClick6 = new JButton("6");
        JButton buttonClick7 = new JButton("7");
        JButton buttonClick8 = new JButton("8");
        JButton buttonClick9 = new JButton("9");
        JButton buttonClickEqually = new JButton("=");
        JButton buttonClickMinus = new JButton("-");
        JButton buttonClickPlus = new JButton("+");
        JButton buttonClickMultiply = new JButton("*");
        JButton buttonClickShare = new JButton("/");
        JButton buttonClickClear = new JButton("C");
        JButton buttonClickDouble = new JButton(".");
        JButton buttonClickPercent = new JButton("%");
        JButton buttonClickSQRT = new JButton("^2");
        JButton buttonClickModul = new JButton("| |");
        JTextField textField = new JTextField(JTextField.CENTER);

//        Создаём панели
        JPanel content = new JPanel(new GridLayout(2, 0)); // Главная панель
        JPanel text = new JPanel(new GridLayout(1, 0)); // Панель для ввода данных
        JPanel jPanel = new JPanel(new GridLayout(5, 2, 2, 2)); // Панель с кнопками

        content.add(text); // Поле для ввода данных
        content.add(jPanel); // Окно для кнопочек

        textField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        text.add(textField);

        jPanel.add(buttonClickClear);
        jPanel.add(buttonClickPercent);
        jPanel.add(buttonClickSQRT);
        jPanel.add(buttonClickPercent);
        jPanel.add(buttonClickModul);
        jPanel.add(buttonClick7);
        jPanel.add(buttonClick8);
        jPanel.add(buttonClick9);
        jPanel.add(buttonClickMultiply);
        jPanel.add(buttonClick4);
        jPanel.add(buttonClick5);
        jPanel.add(buttonClick6);
        jPanel.add(buttonClickMinus);
        jPanel.add(buttonClick1);
        jPanel.add(buttonClick2);
        jPanel.add(buttonClick3);
        jPanel.add(buttonClickPlus);
        jPanel.add(buttonClick0);
        jPanel.add(buttonClickShare);
        jPanel.add(buttonClickDouble);
        jPanel.add(buttonClickEqually);

        getContentPane().add(content);

        setVisible(true); // Включить отображение окна
    }
}
