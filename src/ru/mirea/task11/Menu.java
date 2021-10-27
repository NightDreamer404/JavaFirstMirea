package ru.mirea.task11;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame
{
    private JPanel panel = new JPanel(new BorderLayout());
    private JTextArea area = new JTextArea();
    private JFrame frame = new JFrame("TextApp");
    private JMenuBar menu = new JMenuBar();

    public void createWindow()
    {
        panel.add(area);
        menu.add(ColorMenu());
        menu.add(FontMenu());
        frame.setJMenuBar(menu);
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
    }

    public JMenu ColorMenu()
    {
        JMenu color = new JMenu("Color");
        JMenuItem black = new JMenuItem("Black");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");
        JMenuItem blue = new JMenuItem("Blue");
        color.add(black);
        color.addSeparator();
        color.add(red);
        color.addSeparator();
        color.add(green);
        color.addSeparator();
        color.add(blue);

        ActionListener actionListenerOne = new BlackColor();
        ActionListener actionListenerTwo = new RedColor();
        ActionListener actionListenerThree = new GreenColor();
        ActionListener actionListenerFour = new BlueColor();

        black.addActionListener(actionListenerOne);
        red.addActionListener(actionListenerTwo);
        green.addActionListener(actionListenerThree);
        blue.addActionListener(actionListenerFour);
        return color;
    }

    public JMenu FontMenu()
    {
        JMenu font = new JMenu("Font");
        JMenuItem type1  = new JMenuItem("Helvetica");
        JMenuItem type2  = new JMenuItem("Times New Roman");
        JMenuItem type3 = new JMenuItem("Calibri");
        JMenuItem type4 = new JMenuItem("Arial");

        font.add(type1);
        font.addSeparator();

        font.add(type2);
        font.addSeparator();

        font.add(type3);
        font.addSeparator();

        font.add(type4);

        ActionListener actionFontOne = new FontOne();
        ActionListener actionFontTwo = new FontTwo();
        ActionListener actionFontThree = new FontThree();
        ActionListener actionFontFour = new FontFour();

        type1.addActionListener(actionFontOne);
        type2.addActionListener(actionFontTwo);
        type3.addActionListener(actionFontThree);
        type4.addActionListener(actionFontFour);

        return font;
    }

    public class BlackColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setForeground(Color.black);
        }
    }
    public class RedColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setForeground(Color.red);
        }
    }
    public class GreenColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setForeground(Color.green);
        }
    }
    public class BlueColor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setForeground(Color.blue);
        }
    }
    public class FontOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setFont(new Font("Helvetica", Font.BOLD, 14));
        }
    }
    public class FontTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
        }
    }
    public class FontThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setFont(new Font("Calibri", Font.PLAIN, 12));
        }
    }
    public class FontFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area.setFont(new Font("Arial", Font.BOLD, 20));
        }
    }
    public static void main (String[] args)
    {
        Menu menu = new Menu();
        menu.createWindow();
    }
}
