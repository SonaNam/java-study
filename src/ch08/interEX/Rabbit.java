package ch08.interEX;

public class Rabbit implements Runnable {
    @Override
    public int run() {
        System.out.println("The rabbit is running fast!");
        return 0;
    }
}
