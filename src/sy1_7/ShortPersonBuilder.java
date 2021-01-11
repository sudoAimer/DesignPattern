package sy1_7;

public class ShortPersonBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        person.setHead("矮小人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("矮小人的身体");
    }

    @Override
    public void buildArm() {
        person.setArm("矮小人的胳膊");
    }

    @Override
    public void buildLeg() {
        person.setLeg("矮小人的腿");
    }
}
