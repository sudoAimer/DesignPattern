package sy3_6;

public class Department extends AbstractSchool {

    public Department(String name) {
        super(name);
    }

    @Override
    public void changeName(String name) {
        if(!this.name.equals(name)){
            this.name = name;

            for(Object obs:observers) {
                ((AbstractObserver)obs).response(name);
            }

        }
    }
}
