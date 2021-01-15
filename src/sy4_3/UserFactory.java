package sy4_3;

public class UserFactory {
    public static User getUser(int permission)
    {
        if(permission == 0){
            return new Employee();
        }
        else if(permission == 1)
        {
            return new Manager();
        }
        else return new Admin();
    }
}
