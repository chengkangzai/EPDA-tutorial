package view;

import controller.LoginController;
import controller.RegisterController;
import controller.StopController;

import javax.swing.*;
import java.awt.*;

public class Page1 extends JFrame {
    private final Button register;
    private final Button login;
    private final Button stop;

    public Page1() {
        setSize(250, 100);
        setLocation(700, 100);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        register = new Button("Register");
        register.addActionListener(new RegisterController());
        login = new Button("Login");
        login.addActionListener(new LoginController());
        stop = new Button("Stop");
        stop.addActionListener(new StopController());
        add(register);
        add(login);
        add(stop);
        setVisible(true);
    }

    public Button getRegister() {
        return register;
    }

    public Button getLogin() {
        return login;
    }

    public Button getStop() {
        return stop;
    }
}
