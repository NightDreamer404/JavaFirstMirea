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
            path[i] = scan.nextLine();
        }

        while(true) {
            for (int i = 0; i < path.length; i++) {
                ImageIcon img = new ImageIcon(path[i]); //создаём объект, хранящий картинку
                JLabel label = new JLabel(img);     //создаем лейбл c картинкой
                frame.add(label); //добавляем лейбл с картинкой к окну
                frame.setVisible(true);
                try {                               //усыпляем программу на некоторое время
                    Thread.sleep(100);
                } catch(InterruptedException ex) {}
                frame.getContentPane().removeAll(); //извлекаем слой панели содержимого и очищаем его
            }
        }
    }
}
