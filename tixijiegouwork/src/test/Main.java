package test;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        displayimg("E:\\software\\softwareTest\\work_tixijiegou\\images\\case3.png");
    }
    public static void displayimg(String name) {

        // 创建一个 JFrame 对象

        JFrame frame = new JFrame("Display Image");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个 JLabel 对象，并设置图片

        ImageIcon imageIcon = new ImageIcon(name);

        JLabel label = new JLabel(imageIcon);

        // 将 JLabel 添加到 JFrame 中

        frame.getContentPane().add(label, BorderLayout.CENTER);

        // 设置 JFrame 的大小和可见性

        frame.setSize(1000, 800);

        frame.setVisible(true);

    }
}
