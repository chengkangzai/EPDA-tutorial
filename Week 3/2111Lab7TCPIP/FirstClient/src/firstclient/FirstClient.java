package firstclient;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
public class FirstClient {
    public static void main(String[] args) {
        Socket s;
        BufferedReader input;
        BufferedWriter output;
        try{
            s = new Socket("127.0.0.1",24000);
            input = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
            output = new BufferedWriter(
                new OutputStreamWriter(s.getOutputStream()));                
            
            System.out.println(input.readLine());
            System.out.println(input.readLine());
            output.write("Tan Ka-Shing!\n");
            output.flush();
            output.write("TP049565!\n");
            output.flush();
        } catch(Exception e){
            System.out.println("Error in main method ...");
        }
    }    
}
