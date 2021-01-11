package sy3_5;

public class Caretaker {    //负责人类
    private Memento memento;

    public Caretaker() {
        memento = new Memento();
    }

    public void addMemento(UserInfoDTO user) {
        this.memento.save(user);
    }

    public UserInfoDTO undo() {
        return memento.undo();
    }

    public Memento getMemento()
    {
        return memento;
    }

    public void setMemento(Memento memento)
    {
        this.memento=memento;
    }
}
