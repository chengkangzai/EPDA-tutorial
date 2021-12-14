package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
//        Socket s;
//        BufferedReader in;
//        BufferedWriter out;
//        try {
//            s = new Socket("localhost", 8080);
//            in = new BufferedReader(new java.io.InputStreamReader(s.getInputStream()));
//            out = new BufferedWriter(new java.io.OutputStreamWriter(s.getOutputStream()));
//
//            System.out.println(in.readLine());
//            System.out.println(in.readLine());
//
//            out.write("CCK\n");
//            out.flush();
//            System.out.println(in.readLine());
//
//            out.write("TP051436 \n");
//            out.flush();
//            System.out.println(in.readLine());
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        Socket s;
        BufferedReader input;
        BufferedWriter output;
        try {
            s = new Socket("127.0.0.1", 8080);
            input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            output = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            System.out.println(input.readLine());
            System.out.println(input.readLine());
            output.write("Tan Ka-Shing!\n");
            output.flush();
            output.write("TP049565!\n");
            output.flush();
        } catch (Exception e) {
            System.out.println("Error in main method ...");
        }
    }
}
