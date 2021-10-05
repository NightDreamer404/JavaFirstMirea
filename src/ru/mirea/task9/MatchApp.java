package ru.mirea.task9;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
import java.util.Scanner;
import javax.swing.*;

public class MatchApp
{
    protected String team1Name;
    protected String team2Name;
    private JLabel label1;
    public MatchApp(String team1Name, String team2Name)
    {
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        label1 = new JLabel(team1Name + " " + team1 + " x " + team2 + " " + team2Name);
    }
    protected JButton button1;
    protected JButton button2;
    protected int team1 = 0;
    protected int team2 = 0;

    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    public void createGUI() {
        JFrame frame = new JFrame("MatchApp");
        frame.setSize(350, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();


        button1 = new JButton(team1Name);
        panel.add(button1);

        button2 = new JButton(team2Name);
        panel.add(button2);


        label1.setFont(new Font("Arial", Font.PLAIN, 30));
        label2.setFont(new Font("Calibri", Font.PLAIN, 26));
        label3.setFont(new Font("Consolas", Font.PLAIN, 26));
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        ActionListener actionListener1 = new pressActionListenerFir();
        ActionListener actionListener2 = new pressActionListenerSec();

        button1.addActionListener(actionListener1);
        button2.addActionListener(actionListener2);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public class pressActionListenerFir implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            team1++;
            label1.setText(team1Name + " " + team1 + " x " + team2 + " " + team2Name);
            label2.setText("Last Scorer: " + team1Name);
            if (team1 > 10)
            {
                label3.setText(team1Name + " won!");
                button1.hide();
                button2.hide();
                label2.hide();
            }
        }
    }

    public class pressActionListenerSec implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            team2++;
            label1.setText(team1Name + " " + team1 + " x " + team2 + " " + team2Name);
            label2.setText("Last Scorer: " + team2Name);
            if (team2 > 10)
            {
                label3.setText(team2Name + " won!");
                button1.hide();
                button2.hide();
                label2.hide();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите названия команд");
        MatchApp app1 = new MatchApp(scan.next(), scan.next());
        app1.createGUI();
    }
}