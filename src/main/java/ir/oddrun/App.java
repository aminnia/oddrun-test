package ir.oddrun;

import java.io.IOException;
import ir.oddrun.model.Incrementer;


public class App {
    private static final int THREAD_NUMBER = 10;

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_NUMBER; i++) {
            Incrementer incrementer = new Incrementer();

            Thread thread = new Thread(() -> {
                try {
                    incrementer.increment();
                } catch (IOException e) {
                    System.out.println("File Error.");
                } catch (InterruptedException e) {
                    System.out.println("thread interrupted.");
                }
            });

            thread.start();
        }
    }
}
