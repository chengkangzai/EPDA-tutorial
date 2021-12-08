package controller;

import database.BinaryIO;
import week01.Week01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Week01.second.getWithdraw()) {
            //TODO get how many user wish to withdraw
            // check if the balance is sufficient
            //remove the balance
            String userName = Week01.user.getName();
            String temp = JOptionPane.showInputDialog("How many you want to withdraw");

            if (temp == null || temp.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number");
                return;
            }

            try {
                int deposit = Integer.parseInt(temp);

                for (int i = 0; i < BinaryIO.data.size(); i++) {
                    if (BinaryIO.data.get(i).getName().equals(userName)) {
                        double balance = BinaryIO.data.get(i).getBalance();
                        if (balance <= deposit) {
                            JOptionPane.showMessageDialog(null, "You don't have enough balance");
                            JOptionPane.showMessageDialog(null, "Your balance is " + balance);
                        } else {
                            BinaryIO.data.get(i).setBalance(balance - deposit);
                        }
                    }
                }
                BinaryIO.writeData();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number");
            }

        } else {
            Week01.user = null;
            Week01.first.setVisible(true);
            Week01.second.setVisible(false);
        }
    }
}
