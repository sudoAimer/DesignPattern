package sy1_4;

import org.junit.Test;

public class Client {
    @Test
    public void test1(){
        DBFactory data;
        Connection connect;
        Statement state;
        //getBean()的返回类型是Object,此处需要进行强制类型转换
        data = (DBFactory) XMLUtil.getBean();
        connect = data.createConnection();
        connect.conn();
        state = data.createStatement();
        state.execute();
    }
}

