package lesson8.examples;

import javax.swing.*;
import java.awt.*;

public class Example1 {

    static class MyWindow extends JFrame {
        public MyWindow() {
            setTitle("Test Window");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            setLocationRelativeTo(null);
            setSize(400, 400);
            setLocation(300, 300);
//            setBounds(2400, 300, 400, 400);
            setVisible(true);
        }
    }

    private static class WindowRunnable implements /* extends */ Runnable {

        @Override
        public void run() {
            new MyWindow();
        }
    }

    public static void main(String[] args) {
        new MyWindow();
//        EventQueue.invokeLater(new WindowRunnable());
//        EventQueue.invokeLater(MyWindow::new);

    }


}
