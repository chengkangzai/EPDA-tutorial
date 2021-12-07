package controller;

import database.BinaryIO;
import model.MyUser;
import week01.Week01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String input = JOptionPane.showInputDialog("Username:");
        MyUser found = BinaryIO.checking(input);
        if (found == null) {
            String x = JOptionPane.showInputDialog("Pin:");
            int pin = Integer.parseInt(x);

            x = JOptionPane.showInputDialog("Gender:");
            char gender = x.charAt(0);

            x = JOptionPane.showInputDialog("Initial balance:");
            double balance = Double.parseDouble(x);

            BinaryIO.data.add(new MyUser(input, pin, gender, balance));
            BinaryIO.writeData();
        } else {
            JOptionPane.showMessageDialog(
                    Week01.first.getRegister(), "Invalid username!");
        }
    }
}
