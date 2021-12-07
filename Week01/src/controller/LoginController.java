package controller;

import database.BinaryIO;
import model.MyUser;
import week01.Week01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Week01.first.getLogin()) {
            String input = JOptionPane.showInputDialog("Username:");
            MyUser user = BinaryIO.checking(input);
            if (user != null) {
                input = JOptionPane.showInputDialog("Pin:");
                if (user.getPin() == Integer.parseInt(input)) {
                    Week01.login = user;
                    Week01.first.setVisible(false);
                    Week01.second.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(Week01.first.getLogin(),
                            "Wrong pin!");
                }
            } else {
                JOptionPane.showMessageDialog(Week01.first.getLogin(),
                        "Wrong username!");
            }
        } else {
            Week01.login = null;
            Week01.first.setVisible(true);
            Week01.second.setVisible(false);
        }
    }
}
