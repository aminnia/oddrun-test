package ir.oddrun.creator;

import ir.oddrun.io.NumberReader;
import ir.oddrun.io.FileNumberReader;
import ir.oddrun.io.FileNumberWriter;
import ir.oddrun.io.NumberWriter;


public class ObjectCreator {
    public static NumberReader getNumberReader() {
        return FileNumberReader.getInstance();
    }

	public static NumberWriter getNumberWriter() {
		return FileNumberWriter.getInstance();
	}
}
