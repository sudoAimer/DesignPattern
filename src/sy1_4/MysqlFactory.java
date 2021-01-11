package sy1_4;

public class MysqlFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySqlStatement();
    }
}
