package ru.mirea.task8;
import javax.swing.*;
import java.util.Scanner;
public class PictureAnim {
    public static void main(String[] argc) {
        String[] path = new String[8];
        Scanner scan = new Scanner(System.in);
        JFrame frame = new JFrame("PictureFrame"); //создание окна с рамкой
        //frame.add(new JLabel(new ImageIcon("D:/test/pic.jpg")));

        for (int i = 0; i < 8; i++)
        {
            path[i] = scan.next();
        }

        while(true) {
            for (int i = 0; i < path.length; i++) {
                frame.add(new JLabel(new ImageIcon(path[i]))); //добавляем лейбл с нашей картинкой
                frame.setSize(300, 300); //выставляем размер окна
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //программа прекратит выполнение при закрытии окна
                frame.setVisible(true);
                try {                               //усыпляем программу на некоторое время
                    Thread.sleep(100);
                } catch(InterruptedException ex) {}
                frame.getContentPane().removeAll(); //извлекаем слой панели содержимого и очищаем его
            }
        }
    }
}
