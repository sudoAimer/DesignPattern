package sy1_1;

public class Nvwa {
    public static Person makePerson(String type) {
        Person p;
        if(type.equals("M")) {
            p=new Man();
            return p;
        } else if (type.equals("W")){
            return new Woman();
        }else if (type.equals("R")) {
            return new Robot();
        }else return null;
    }
}
