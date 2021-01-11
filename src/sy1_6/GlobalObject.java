package sy1_6;

public class GlobalObject {
    public ConnectionPoolManager getConnectionPoolManager(){
        return ConnectionPoolManager.getInstance();
    }
}
