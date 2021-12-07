package controller;

import database.BinaryIO;
import week01.Week01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String input = JOptionPane.showInputDialog("Enter password:");
        int password = Integer.parseInt(input);
        if (password == 12345) {
            BinaryIO.writeData();
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(Week01.first.getStop(),
                    "Wrong password!");
        }
    }
}
