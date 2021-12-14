package controller;
//import database.BinaryIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import client.Client;
public class StopController implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Client.output.write("S\n");
            Client.output.flush();
            String input = JOptionPane.showInputDialog("Enter password:");
            Client.output.write(input+"\n");
            Client.output.flush();
        } catch(Exception ex){
            System.out.println("Error in stop ...");
        }
        
//        int password = Integer.parseInt(input);
//        if(password == 12345){
//            BinaryIO.writeData();
//            System.exit(0);
//        } else{
//            JOptionPane.showMessageDialog(Week01.first.getStop(),
//                    "Wrong password!");
//        }
    }    
}
