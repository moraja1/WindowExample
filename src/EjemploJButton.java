import javax.swing.*;
import java.awt.*;

public class EjemploJButton {
    EjemploJButton(){
        JFrame a = new JFrame("Example Window");
        JPanel p = new JPanel();
        JButton c = new JButton("click me!");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem menuItem1 = new JMenuItem("Example1");
        JMenuItem menuItem2 = new JMenuItem("Example2");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menuBar.add(menu);
        BorderLayout bl = new BorderLayout();
        JScrollBar d = new JScrollBar();
        JTextField b = new JTextField("JTextField utilizando swing");
        a.setJMenuBar(menuBar);
        a.setLayout(bl);
        p.add(b);
        p.setBackground(Color.BLACK);
        b.setBounds(50,100,200,30);
        a.add(p, BorderLayout.CENTER);
        a.add(c, BorderLayout.SOUTH);
        a.add(d, BorderLayout.EAST);

        c.setBounds(new Rectangle(100, 25));
        a.setSize(300,300);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new EjemploJButton();
    }
}
