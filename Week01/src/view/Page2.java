package view;

import controller.DepositController;
import controller.LoginController;
import controller.UpdatePasswordController;
import controller.WithdrawController;

import javax.swing.*;
import java.awt.*;

public class Page2 extends JFrame {
    private final Button deposit;
    private final Button withdraw;
    private final Button update;
    private final Button logout;

    public Page2() {
        setSize(250, 100);
        setLocation(700, 300);
        setLayout(new FlowLayout());
        deposit = new Button("Deposit");
        withdraw = new Button("Withdraw");
        update = new Button("Update");
        logout = new Button("Logout");
        logout.addActionListener(new LoginController());
        deposit.addActionListener(new DepositController());
        withdraw.addActionListener(new WithdrawController());
        update.addActionListener(new UpdatePasswordController());
        add(deposit);
        add(withdraw);
        add(update);
        add(logout);
    }

    public Button getDeposit() {
        return deposit;
    }

    public Button getWithdraw() {
        return withdraw;
    }

    public Button getUpdate() {
        return update;
    }
}
