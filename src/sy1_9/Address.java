package sy1_9;

import java.io.Serializable;

public class Address implements Serializable {
    public String sheng;
    public String shi;
    public String qu;

    public Address(String sheng, String shi, String qu) {
        this.sheng = sheng;
        this.shi = shi;
        this.qu = qu;
    }
}
