package sy4_8;

import java.util.ArrayList;

public abstract class MySubject {
    protected ArrayList observers = new ArrayList();
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    public abstract void lack();    //抽象通知方法
}
