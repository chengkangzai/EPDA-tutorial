package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket;
        Socket s;
        BufferedReader in;
        BufferedWriter out;

        try {
            serverSocket = new ServerSocket(8080);
            while (true) {
                s = serverSocket.accept();
                in = new BufferedReader(new java.io.InputStreamReader(s.getInputStream()));
                out = new BufferedWriter(new java.io.OutputStreamWriter(s.getOutputStream()));

                out.write("Welcome to the server!");
                out.write("Give me your name and TP number ! \n");
                String name = in.readLine();
                out.write("Hello " + name + " ! \n");
                String tp = in.readLine();
                out.write("Your TP number is " + tp + " ! \n");
                out.write("Bye bye ! \n");
            }
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
        }
    }
}
