package database;

import model.MyUser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BinaryIO {
    public static ArrayList<MyUser> data = new ArrayList<MyUser>();

    public static void readData() {
        try {
            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("data.dat"));
            if (input != null) {
                data = (ArrayList<MyUser>) input.readObject();
            }
            if (data == null) {
                data = new ArrayList<MyUser>();
            }
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i));
            }
            input.close();
        } catch (Exception e) {
            data = new ArrayList<MyUser>();
            System.out.println("Error in readData method!");
        }
    }

    public static void writeData() {
        try {
            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream("data.dat"));
            output.writeObject(data);
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i));
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Error in writeData method!");
        }
    }

    public static MyUser checking(String x) {
        MyUser found = null;
        for (int i = 0; i < data.size(); i++) {
            MyUser j = data.get(i);
            if (x.equals(j.getName())) {
                found = j;
                break;
            }
        }
        return found;
    }
}
