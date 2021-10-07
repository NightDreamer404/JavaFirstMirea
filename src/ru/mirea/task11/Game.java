package ru.mirea.task11;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Game extends JFrame
{

    private int attempts = 3;
    private int ranNum = (int) (1 + Math.random()*30);
    private JLabel label1 = new JLabel("Вас приветствует игра-угадайка");
    private JLabel label2 = new JLabel("Ваша задача: ввести целое число в текстовое поле");
    private JLabel label3 = new JLabel("Диапазон от 1 до 30, желаем удачи!");
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JTextPane textEditor= new JTextPane();
    private JFrame frame = new JFrame("MatchApp");


    public Game() {};

    protected JButton button1;
    protected JButton button2;



    public void createGUI() {
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
        Dimension size1 = new Dimension();
        size1.height = 20;
        size1.width = 200;
        frame.setSize(400, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textEditor.setPreferredSize(size1);

        label1.setFont(new Font("Arial", Font.PLAIN, 16));
        label2.setFont(new Font("Calibri", Font.PLAIN, 14));
        label3.setFont(new Font("Consolas", Font.PLAIN, 14));

        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);

        button1 = new JButton("Start");
        button2 = new JButton("Enter");
        panel1.add(button1);




        ActionListener actionListener1 = new pressActionListenerFir();
        ActionListener actionListener2 = new pressActionListenerSec();

        button1.addActionListener(actionListener1);
        button2.addActionListener(actionListener2);

        frame.getContentPane().add(panel1);
        frame.setVisible(true);
    }

    public class pressActionListenerFir implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label2.setText(" ");
            panel2.add(label1);

            panel2.add(button2);
            panel2.add(textEditor);
            panel2.add(label2);
            label1.setText("Попыток: " +  attempts);
            label2.setFont(new Font("Arial", Font.PLAIN, 16));
            button1.hide();
            label3.hide();
            frame.getContentPane().add(panel2);

        }
    }

    public class pressActionListenerSec implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(Integer.parseInt(textEditor.getText()) > ranNum)
            {
                label2.setText("Введённое число больше угаданного");
                label1.setText("Попыток: " + --attempts);
                if(attempts == 0)
                {
                    button2.hide();
                    textEditor.hide();
                    label1.setText("Попытки кончились, ");
                    label2.setText("загаданное число: " + ranNum);
                }
            }
            else if (Integer.parseInt(textEditor.getText()) < ranNum)
            {
                label2.setText("Введённое число меньше угаданного");
                label1.setText("Попыток: " + --attempts);
                if(attempts == 0)
                {
                    button2.hide();
                    textEditor.hide();
                    label1.setText("Попытки кончились, ");
                    label2.setText("загаданное число: " + ranNum);
                }
            }
            else
            {
                button2.hide();
                label2.hide();
                label1.setText("Поздравляем, вы угадали");
            }
        }
    }
    public static void main(String[] args) {
        Game app1 = new Game();
        app1.createGUI();
    }
}