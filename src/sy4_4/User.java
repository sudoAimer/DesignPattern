package sy4_4;

public class User {
    private PersonalInformation personalInformation;
    private ConnectMethod connectMethod;

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public ConnectMethod getConnectMethod() {
        return connectMethod;
    }

    public void setConnectMethod(ConnectMethod connectMethod) {
        this.connectMethod = connectMethod;
    }
}
