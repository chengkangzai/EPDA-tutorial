package controller;

import database.BinaryIO;
import week01.Week01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Week01.second.getDeposit()) {
            String temp = JOptionPane.showInputDialog("How much do you want to deposit");
            String userName = Week01.user.getName();

            if (temp == null || temp.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid amount");
                return;
            }

            try {
                int deposit = Integer.parseInt(temp);

                for (int i = 0; i < BinaryIO.data.size(); i++) {
                    if (BinaryIO.data.get(i).getName().equals(userName)) {
                        BinaryIO.data.get(i).setBalance(BinaryIO.data.get(i).getBalance() + deposit);
                    }
                }
                BinaryIO.writeData();
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null, "Please enter a valid amount");
            }

        } else {
            Week01.user = null;
            Week01.first.setVisible(true);
            Week01.second.setVisible(false);
        }
    }
}
