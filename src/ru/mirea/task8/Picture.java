package ru.mirea.task8;
import javax.swing.*;

public class Picture {
    public static void main(String[] argc) {
        String imageFile ="";
        if (argc.length > 0) {
            for(int i = 0; i <argc.length; i++)
            imageFile += argc[i];
        }


        JFrame frame = new JFrame("PictureFrame"); //создание окна с рамкой
        //frame.add(new JLabel(new ImageIcon("D:/test/aboba.jpg")));

        frame.add(new JLabel(new ImageIcon(imageFile))); //добавляем лейбл с нашей картинкой
        frame.setSize(512, 512); //выставляем размер окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //программа прекратит выполнение при закрытии окна
        frame.setVisible(true);
    }
}
