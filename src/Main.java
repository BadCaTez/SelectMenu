import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

public class Main extends JFrame {

    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    JButton but1 = new JButton("Задание 1");
    JButton but2 = new JButton("Задание 2");
    JButton but3 = new JButton("Задание 3");
    JButton but4 = new JButton("Задание 4");
    JButton but5 = new JButton("Задание 5");
    JButton but6 = new JButton("Задание 6");
    JButton but7 = new JButton("Задание 7");
    JButton but8 = new JButton("Задание 8");
    JButton but9 = new JButton("Задание 9");

    public Main(){
        super("Меню заданий");
        setSize(600,300);

        add(but1);
        but1.setBounds(50,0,100,25);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise1#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(but2);
        but2.setBounds(165,0,100,25);
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise2#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(but3);
        but3.setBounds(280,0,100,25);
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise3#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(but4);
        but4.setBounds(50,50,100,25);
        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise4#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(but5);
        but5.setBounds(165,50,100,25);
        but5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise5#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(but6);
        but6.setBounds(280,50,100,25);
        but6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise6#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(but7);
        but7.setBounds(50,100,100,25);
        but7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise7#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(but8);
        but8.setBounds(165,100,100,25);
        but8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise8#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add(but9);
        but9.setBounds(280,100,100,25);
        but9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    desktop.browse(URI.create("https://replit.com/@ivanru928/Exercise9#Main.java"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}