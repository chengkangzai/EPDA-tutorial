package controller;

import database.BinaryIO;
import week01.Week01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdatePasswordController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Week01.second.getUpdate()) {
            String temp = JOptionPane.showInputDialog("Enter current pin");
            String userName = Week01.user.getName();

            //check if the password is correct
            for (int i = 0; i < BinaryIO.data.size(); i++) {
                if (BinaryIO.data.get(i).getName().equals(userName)) {
                    if (BinaryIO.data.get(i).getPin() == Integer.parseInt(temp)) {
                        String newPassword = JOptionPane.showInputDialog("Enter new pin");
                        BinaryIO.data.get(i).setPin(Integer.parseInt(newPassword));
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Incorrect pin");
                        return;
                    }
                }
            }

            //save the new password
            BinaryIO.writeData();
        } else {
            Week01.user = null;
            Week01.first.setVisible(true);
            Week01.second.setVisible(false);
        }
    }
}
