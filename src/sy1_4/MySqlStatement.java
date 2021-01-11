package sy1_4;

public class MySqlStatement implements Statement{
    @Override
    public void execute() {
        System.out.println("mysql语句对象");
    }
}
