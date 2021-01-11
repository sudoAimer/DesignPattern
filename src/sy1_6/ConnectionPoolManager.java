package sy1_6;

import sy1_6.Connection;

public class ConnectionPoolManager {
    private ConnectionPoolManager(){}
    private static ConnectionPoolManager instance = null;

    public Connection getConnection() {
        return new Connection();
    }
    synchronized public static ConnectionPoolManager getInstance() {
        if(instance == null) {
            instance= new ConnectionPoolManager();
        }
        return instance;
    }
}
