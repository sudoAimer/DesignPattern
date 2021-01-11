package sy1_7;

public abstract class PersonBuilder {
    protected Person person = new Person();

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArm();
    public abstract void buildLeg();

    public Person getResult() {
        return person;
    }
}
