package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setTitle("My Simple Window");// Название окна
        setBounds(600,300,400,400); //Размер окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);// При закрытии окна , программа заканчивает работу
        setLayout(new BorderLayout()); // Размещение элементов по сторонам света
        setResizable(false); // Запрещает менять размер окна

        JTextField textField = new JTextField(); // Одна строчная строка
        add(textField, BorderLayout.NORTH);

        Font font = new Font("Arail",Font.PLAIN,14);// параметры шрифта
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1,3));// создаем панель и ставим 3 кнопки
        buttonsPanel.setBackground(Color.BLUE); //Задаем цвет панели
        add(buttonsPanel, BorderLayout.CENTER); // Размещаем по стронам света = центр

        JButton button1 = new JButton("1"); //Создали кнопку на ней будет отображена цифра 1
        JButton button2 = new JButton("2"); //Создали кнопку на ней будет отображена цифра 1
        JButton button3 = new JButton("3"); //Создали кнопку на ней будет отображена цифра 1
        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        buttonsPanel.add(button3);

        button1.addActionListener(new ActionListener() { // задаем действие кнопке 1
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("1");
            }
        });
        button2.addActionListener(new ActionListener() {//задаем действие кнопке 2
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("2");
            }
        });
        button3.addActionListener(new ActionListener() {//задаем действие кнопке 3
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("3");
            }
        });






        setVisible(true);
    }

}
