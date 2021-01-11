package sy1_7;

public class TallPersonBuilder extends PersonBuilder{
    @Override
    public void buildHead() {
        person.setHead("高小人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("高小人的身体");
    }

    @Override
    public void buildArm() {
        person.setArm("高小人的胳膊");
    }

    @Override
    public void buildLeg() {
        person.setLeg("高小人的腿");
    }
}
