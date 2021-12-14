package com.company;

import database.BinaryIO;
import model.MyUser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyConnection implements Runnable {
    Socket s;
    BufferedReader in;
    BufferedWriter out;

    MyConnection() {
        this.s = new Socket();
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = new BufferedWriter(new java.io.OutputStreamWriter(s.getOutputStream()));
            //for loop each line read
            String line = in.readLine();
            while (line != null) {
                if (line.equals("Register")) {
                    register();
                }
                if (line.equals("Stop")) {
                    stop();
                }
                line = in.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void register() throws Exception {
        String name = in.readLine();
        MyUser found = BinaryIO.checking(name);
        if (found == null) {
            out.write("Valid");
            out.flush();

            String x = in.readLine();
            int pin = Integer.parseInt(x);

            x = in.readLine();
            char gender = x.charAt(0);

            x = in.readLine();
            double balance = Double.parseDouble(x);

            BinaryIO.data.add(new MyUser(name, pin, gender, balance));

        } else {
            out.write("Invalid");
            out.flush();
        }
    }

    public void stop() throws Exception {
        String password = in.readLine();
        if (password.equals("1234")) {
            out.write("Valid");
            out.flush();
        } else {
            out.write("Invalid");
        }
    }

}
