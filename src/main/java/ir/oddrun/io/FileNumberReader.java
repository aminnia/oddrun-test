package ir.oddrun.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileNumberReader extends FileIo implements NumberReader {
    private static FileNumberReader instance = new FileNumberReader();
    public static FileNumberReader getInstance() {
        return instance;
    }

    @Override
    public int readNumber() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME));
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
}
