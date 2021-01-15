package sy4_8;

public class Client {
    public static void main(String[] args) {
        MySubject mySubject = new Commodity();
        Observer ob1,ob2;
        ob1 = new Saler();
        ob2 = new Logistical();
        mySubject.attach(ob1);
        mySubject.attach(ob2);

        mySubject.lack();
    }
}
