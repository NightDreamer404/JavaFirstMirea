package ru.mirea.task11;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class RoadFork extends JFrame{
        private JLabel label1 = new JLabel("Запад");
        private JLabel label2 = new JLabel("Восток");
        private JLabel label3 = new JLabel("Север", SwingConstants.CENTER);
        private JLabel label4 = new JLabel("Юг", SwingConstants.CENTER);
        private JLabel label5 = new JLabel("Центр", SwingConstants.CENTER);
        public void RoadWindow()
        {
                JFrame frame = new JFrame("Location");

                label1.setFont(new Font("Arial", Font.PLAIN, 30));
                label2.setFont(new Font("Arial", Font.PLAIN, 30));
                label3.setFont(new Font("Arial", Font.PLAIN, 30));
                label4.setFont(new Font("Arial", Font.PLAIN, 30));
                label5.setFont(new Font("Arial", Font.PLAIN, 30));

                label1.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 5));
                label2.setBorder(BorderFactory.createLineBorder(Color.getHSBColor(38,1,1), 5));
                label3.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 5));
                label4.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
                label5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));

                MouseListener event1 = new MouseEvent1();
                MouseListener event2 = new MouseEvent2();
                MouseListener event3 = new MouseEvent3();
                MouseListener event4 = new MouseEvent4();
                MouseListener event5 = new MouseEvent5();

                label1.addMouseListener(event1);
                label2.addMouseListener(event2);
                label3.addMouseListener(event3);
                label4.addMouseListener(event4);
                label5.addMouseListener(event5);

                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setSize(400,400);

                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.add(label1, BorderLayout.WEST);
                panel.add(label2, BorderLayout.EAST);
                panel.add(label3, BorderLayout.NORTH);
                panel.add(label4, BorderLayout.SOUTH);
                panel.add(label5, BorderLayout.CENTER);

                frame.getContentPane().add(panel);
                frame.setVisible(true);

        }

        public class MouseEvent1 implements MouseListener {
                public void mouseEntered(MouseEvent e) {
                       showMessageDialog(null, "Welcome to Ruins");
                }
                public void mouseClicked(MouseEvent e) {}
                public void mousePressed(MouseEvent e) {}
                public void mouseReleased(MouseEvent e) {}
                public void mouseExited(MouseEvent e) {}
        }
        public class MouseEvent2 implements MouseListener {
                public void mouseEntered(MouseEvent e) {
                        showMessageDialog(null, "Welcome to Hotland");
                }
                public void mouseClicked(MouseEvent e) {}
                public void mousePressed(MouseEvent e) {}
                public void mouseReleased(MouseEvent e) {}
                public void mouseExited(MouseEvent e) {}
        }
        public class MouseEvent3 implements MouseListener {
                public void mouseEntered(MouseEvent e) {
                        showMessageDialog(null, "Welcome to New Home");
                }
                public void mouseClicked(MouseEvent e) {}
                public void mousePressed(MouseEvent e) {}
                public void mouseReleased(MouseEvent e) {}
                public void mouseExited(MouseEvent e) {}
        }
        public class MouseEvent4 implements MouseListener {
                public void mouseEntered(MouseEvent e) {
                        showMessageDialog(null, "Welcome to Waterfall");
                }
                public void mouseClicked(MouseEvent e) {}
                public void mousePressed(MouseEvent e) {}
                public void mouseReleased(MouseEvent e) {}
                public void mouseExited(MouseEvent e) {}
        }
        public class MouseEvent5 implements MouseListener {
                public void mouseEntered(MouseEvent e) {
                        showMessageDialog(null, "Welcome to Snowdin");
                }
                public void mouseClicked(MouseEvent e) {}
                public void mousePressed(MouseEvent e) {}
                public void mouseReleased(MouseEvent e) {}
                public void mouseExited(MouseEvent e) {}
        }

        public static void main(String[] args)
        {
                RoadFork window = new RoadFork();
                window.RoadWindow();
        }
}
