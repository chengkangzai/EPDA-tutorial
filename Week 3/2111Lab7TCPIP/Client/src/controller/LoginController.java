//package controller;
//import database.BinaryIO;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JOptionPane;
//import model.MyUser;
//import week01.Week01;
//public class LoginController implements ActionListener{
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == Week01.first.getLogin()){
//            String input = JOptionPane.showInputDialog("Username:");
//            MyUser x = BinaryIO.checking(input);
//            if(x!=null){
//                input = JOptionPane.showInputDialog("Pin:");
//                if(x.getPin() == Integer.parseInt(input)){
//                    Week01.login = x;
//                    Week01.first.setVisible(false);
//                    Week01.second.setVisible(true);
//                } else{
//                    JOptionPane.showMessageDialog(Week01.first.getLogin(),
//                        "Wrong pin!");
//                }
//            } else{
//                JOptionPane.showMessageDialog(Week01.first.getLogin(),
//                        "Wrong username!");
//            }
//        } else{
//            Week01.login = null;
//            Week01.first.setVisible(true);
//            Week01.second.setVisible(false);
//        }
//    }    
//}
