package ru.mirea.task8;
import javax.swing.*;

public class Picture {
    public static void main(String[] argc) {
        String imageFile ="";
        if (argc.length > 0) {
            for(int i = 0; i <argc.length; i++)
            imageFile += argc[i];
        }


        JFrame frame = new JFrame("PictureFrame");  //создание окна с рамкой
        ImageIcon img = new ImageIcon(imageFile);   //создаём объект, хранящий картинку
        JLabel label = new JLabel(img); //создаем лейбл c картинкой
        frame.add(label);   //добавляем лейбл с картинкой к окну
        //"D:/test/pic.jpg"

        frame.setSize(512, 512); //выставляем размер окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //программа прекратит выполнение при закрытии окна
        frame.setVisible(true);
    }
}
