package com.example;

public class App {
    public String checkOddEven(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }
    public static void main(String[] args) {
        System.out.println("10 is " + new App().checkOddEven(10));
    }
}
