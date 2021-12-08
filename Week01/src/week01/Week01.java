package week01;

import database.BinaryIO;
import model.MyUser;
import view.Page1;
import view.Page2;

public class Week01 {
    public static Page1 first = new Page1();
    public static Page2 second = new Page2();
    public static MyUser user;

    public static void main(String[] args) {
        BinaryIO.readData();
    }
}
