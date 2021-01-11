package sy3_9;



public class Client {
    public static void main(String args[]) {
        OnlineStore on = new OnlineStore();
        Member[] m = new Member[3];
        m[0] = new Member("Qiangqiang Huang");
        m[1] = new Member("Yuqian Chen");
        m[2] = new Member("ChenChen Huang");
        on.attach(m[0]);
        on.attach(m[1]);
        on.attach(m[2]);

        on.updateName();
        System.out.println("--------------------------------");
        on.updatePrice();
    }
}
