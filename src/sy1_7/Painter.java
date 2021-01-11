package sy1_7;

public class Painter {
    private PersonBuilder personBuilder;

    public void setPersonBuilder(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public Person construct() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArm();
        personBuilder.buildLeg();
        return personBuilder.getResult();
    }
}
