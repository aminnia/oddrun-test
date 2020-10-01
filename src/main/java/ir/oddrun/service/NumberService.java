package ir.oddrun.service;

import java.io.FileNotFoundException;
import ir.oddrun.creator.ObjectCreator;
import ir.oddrun.io.NumberReader;

public class NumberService {
    private static NumberService numberService = new NumberService();
    public static NumberService getInstance() {
        return numberService;
    }

    private NumberReader numberReader = ObjectCreator.getNumberReader();

    public int getNumberLastValue() throws FileNotFoundException {
        return numberReader.readNumber();
    }
}
