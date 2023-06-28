package ch08.interEX;

public class Human implements Walkable,Runnable {
    @Override
    public double walk() {
        System.out.println("hohoho");
        return 0;
    }
    @Override
    public int run() {
        System.out.println("hahaha");
        return 0;
    }



}


