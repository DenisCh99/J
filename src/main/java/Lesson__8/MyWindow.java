package Lesson__8;

//import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends JFrame {

    public MyWindow(){
        setTitle("My window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //если нажать на крестик окно закроется
        setBounds(300,300,400,500);//указываем:1 и 2 - точка нахождения левого верхнего угла окна по
        //x и  y. 3 и 4 - длина и ширина окна

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
            }
        });

       /* JButton button1 = new JButton("Button_1");
        JButton button2 = new JButton("Button_2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        setVisible(true); //видимость окна*/


       /* setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS)); //компоновщик BoxLayout в него передаем
        // то как он должен выравниваться
        for (int i = 1; i <=10 ; i++) {
            JButton button = new JButton("#"+i);
            add(button);
        }*/

      /*  setLayout(new FlowLayout());
        for (int i = 1; i <=10 ; i++) {
            JButton button = new JButton("#"+i);
            add(button);
        }*/

        /*setLayout(new GridLayout(3,3)); //сетка
        for (int i = 1; i <=10 ; i++) {
            JButton button = new JButton("#"+i);
            add(button);
        }*/

        setLayout(null);
        JTextField textField = new JTextField(); //текстовое поле для набора текста пользователем
        textField.setBounds(20,20, 120,32);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Enter pressed");
            }
        });
        add(textField);
        JButton button = new JButton("Press here!");
        button.setBounds(20,60,120,32);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button pressed");
            }
        });
        add(button);

        setVisible(true); //видимость окна*/
    }

    public static void main(String[] args) {
        new MyWindow();
    }

}
