package sy3_6;


import java.util.ArrayList;

public abstract class AbstractSchool {
    protected ArrayList observers = new ArrayList();

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractSchool(String name) {
        this.name = name;
    }

    public void attach(AbstractObserver observer) {
        observers.add(observer);
    }

    public void detach(AbstractObserver observer) {
        observers.remove(observer);
    }

    public abstract void changeName(String name);
}
