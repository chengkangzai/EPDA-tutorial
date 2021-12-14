package view;
//import controller.LoginController;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JFrame;
public class Page2 extends JFrame{
    private Button deposit,withdraw,update,logout;
    public Page2(){
        setSize(250,100);
        setLocation(700,300);
        setLayout(new FlowLayout());
        deposit = new Button("Deposit");
        withdraw = new Button("Withdraw");
        update = new Button("Update");
        logout = new Button("Logout");
//        logout.addActionListener(new LoginController());
        add(deposit);
        add(withdraw);
        add(update);
        add(logout);
    }
}
