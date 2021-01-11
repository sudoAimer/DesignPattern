package sy1_4;

public interface DBFactory {
    public Connection createConnection();
    public Statement createStatement();
}
