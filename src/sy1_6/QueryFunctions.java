package sy1_6;

import java.util.ArrayList;
import java.util.Collection;

public class QueryFunctions {
    public static Collection findStudentByName(String name){
        GlobalObject globalObject =new GlobalObject();
        ConnectionPoolManager connectionPoolManager = globalObject.getConnectionPoolManager();
        Connection connection = connectionPoolManager.getConnection();
        // query database
        return new ArrayList();
    }
}
