package Lesson__8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {

    private int value;
    private JLabel infoPanel;
    public CounterApp(){
        setBounds(500, 500, 300, 120); //установка поля
        setTitle("CounterApp"); //name program
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //крестик - закрытие программы

        Font font = new Font("Arial", Font.BOLD, 32); //шрифт

        //текстовое поле (нередвктируемое)
        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font); //рисуем это значение лэйбл шрифтом фонт который сами и создали выше
        label.setHorizontalAlignment(SwingConstants.CENTER); //устанавливаем эту надпись по центру
        add(label, BorderLayout.CENTER);

        //добавление инфопанели
        //будем показывать ошибку если значение  по модулю больше десяти
        infoPanel = new JLabel();
        add(infoPanel, BorderLayout.NORTH);

        //кнопки увеличения и уменьшения
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        //обработчик события при нажатии на кнопки
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });


        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        setVisible(true);//есть видимость окна

    }

    private void validateRange(){
        if (Math.abs(value) > 10){
            infoPanel.setText("Alarm");
        }else infoPanel.setText("");
    }


    public static void main(String[] args){
        CounterApp counter = new CounterApp();
    }
}
