package ir.oddrun.model;

public class Lock {
    private static Lock instance = new Lock();
    public static Lock getInstace() {
        return instance;
    }
}
