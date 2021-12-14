package server;
import database.BinaryIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import model.MyUser;
public class MyConnection implements Runnable {
    private Socket s;
    BufferedReader input;
    BufferedWriter output;
    public MyConnection(Socket s) {
        this.s = s;
    }
    @Override
    public void run() {
        try{
            input = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
            output = new BufferedWriter(
                new OutputStreamWriter(s.getOutputStream()));    
            
            String a = null;
            while((a = input.readLine()) != null){
                switch(a){
                    case "R": register(); break;
                    case "S": stop(); break;
                }
            }
        } catch(Exception e){
            System.out.println("Error in run method ...");
        }
    }
    public void register() throws Exception{
        String name = input.readLine();
        MyUser found = BinaryIO.checking(name);
        if(found == null){
            output.write("VU\n");
            output.flush();
            String x = input.readLine();
            int pin = Integer.parseInt(x);
            x = input.readLine();
            char gender = x.charAt(0);
            x = input.readLine();
            double balance = Double.parseDouble(x);
            BinaryIO.data.add(new MyUser(name,pin,gender,balance));
            BinaryIO.writeData();
        } else{
            output.write("IU\n");
            output.flush();
        }        
    }
    public void stop() throws Exception{
        String password = input.readLine();
        if(Integer.parseInt(password) == 12345){
            output.write("VA\n");
            output.flush();
        } else{
            output.write("IA\n");
            output.flush();
        }
    }
}
