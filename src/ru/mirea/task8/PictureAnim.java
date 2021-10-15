package ru.mirea.task8;
import javax.swing.*;
import java.util.Scanner;
public class PictureAnim {
    public static void main(String[] argc) {
        String[] path = new String[8];
        Scanner scan = new Scanner(System.in);
        JFrame frame = new JFrame("PictureFrame"); //создание окна с рамкой
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //программа прекратит выполнение при закрытии окна
        frame.setSize(300, 300); //выставляем размер окна

        for (int i = 0; i < 8; i++)
        {
            path[i] = scan.nextLine();      //тут я храню пути к кадрам анимации
        }

        while(true) {       //анимация будет идти, пока пользователь не закроет окно
            for (int i = 0; i < path.length; i++) {     //проходим по всем кадрам
                ImageIcon img = new ImageIcon(path[i]); //создаём объект, хранящий картинку и передаём путь как параметр
                JLabel label = new JLabel(img);     //создаем лейбл c картинкой
                frame.add(label); //добавляем лейбл с картинкой к окну
                frame.setVisible(true); //показываем окно на мониторе
                try {                               //усыпляем программу на некоторое время (какая-то устойчивая конструкция)
                    Thread.sleep(100);
                } catch(InterruptedException ex) {}
                frame.getContentPane().removeAll(); //извлекаем слой панели содержимого и очищаем его (проще говоря подготавливаем окно к следующему кадру)
            }
        }
    }
}
