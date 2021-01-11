package sy3_10;

public class Changer {
    private Phone phone;

    public Changer(Phone phone) {
        this.phone = phone;
    }

    public void ring() {
        System.out.println("Phone rings!");
        System.out.println("Phone vibrate!");
        System.out.println("Phone light flash!");
    }
}
