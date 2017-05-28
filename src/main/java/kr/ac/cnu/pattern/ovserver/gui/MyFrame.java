package kr.ac.cnu.pattern.ovserver.gui;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

/**
 * Created by rokim on 2017. 5. 28..
 */
public class MyFrame extends JFrame {
    private JFrame mainFrame;
    private JPanel panel;

    public void init() {
        mainFrame = new JFrame("Title");
        mainFrame.setSize(640, 480);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setBackground(Color.CYAN);
        mainFrame.add(panel);

        JButton button = new JButton();
        button.setText("CLICK");
        panel.add(button);

        mainFrame.setVisible(true);
    }
}
