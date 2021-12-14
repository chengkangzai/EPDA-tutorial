package controller;
//import database.BinaryIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//import model.MyUser;
import client.Client;
public class RegisterController implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Client.output.write("R\n");
            Client.output.flush();
            String input = JOptionPane.showInputDialog("Username:");
            Client.output.write(input+"\n");
            Client.output.flush();
        } catch(Exception ex){
            System.out.println("Error in register ...");
        }
        
//        MyUser found = BinaryIO.checking(input);
//        if(found == null){
//            String x = JOptionPane.showInputDialog("Pin:");
//            int pin = Integer.parseInt(x);
//            x = JOptionPane.showInputDialog("Gender:");
//            char gender = x.charAt(0);
//            x = JOptionPane.showInputDialog("Initial balance:");
//            double balance = Double.parseDouble(x);
//            BinaryIO.data.add(new MyUser(input,pin,gender,balance));
//            BinaryIO.writeData();
//        } else{
//            JOptionPane.showMessageDialog(Week01.first.getRegister(),
//                    "Invalid username!");
//        }
    }    
}
