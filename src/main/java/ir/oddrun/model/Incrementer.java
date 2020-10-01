package ir.oddrun.model;

import java.io.IOException;
import ir.oddrun.creator.ObjectCreator;
import ir.oddrun.io.NumberReader;
import ir.oddrun.io.NumberWriter;


public class Incrementer {
    private NumberReader numberReader = ObjectCreator.getNumberReader();
    private NumberWriter numberWriter = ObjectCreator.getNumberWriter();
    private static Lock lock = Lock.getInstace();

    public Incrementer() {}

    public void increment() throws IOException, InterruptedException {
        while (true) {
            synchronized(lock) {
                int number = numberReader.readNumber();
                number++;
                numberWriter.writeNumber(number);
            }
            Thread.sleep(1000);
        }
    }
}
