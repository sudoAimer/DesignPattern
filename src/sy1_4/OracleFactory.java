package sy1_4;

public class OracleFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new OrcalConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
