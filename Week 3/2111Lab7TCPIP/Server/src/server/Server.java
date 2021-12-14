package server;
import database.BinaryIO;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public static void main(String[] args) {
        BinaryIO.readData();
        ServerSocket ss;
        Socket s;
        try{
            ss = new ServerSocket(24000);
            while(true){
                s = ss.accept();
                MyConnection a = new MyConnection(s);
                Thread b = new Thread(a);
                b.start();
            }
        } catch(Exception e){
            System.out.println("Error in main method ...");
            e.printStackTrace();
        }        
    }    
}
