package model;
import java.io.Serializable;
public class MyUser implements Serializable {
    public String toString(){
        return name+" ("+pin+"), you have RM"+balance+"!";
    }
    private String name;
    private int pin;
    private char gender;
    private double balance;
    public MyUser() {
    }
    public MyUser(String name, int pin, char gender, double balance) {
        this.name = name;
        this.pin = pin;
        this.gender = gender;
        this.balance = balance;
    }    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }    
}
