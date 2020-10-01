package ir.oddrun.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class FileNumberWriter extends FileIo implements NumberWriter {
    private static FileNumberWriter instance = new FileNumberWriter();
    public static FileNumberWriter getInstance() {
        return instance;
    }

    @Override
    public void writeNumber(int number) throws IOException {
        Writer writer = new FileWriter(FILE_NAME);
        writer.write(String.valueOf(number));
        writer.close();
    }
}
