package sy4_5;

public class Client {
    public static void main(String[] args) {
        Employer employer,copy;
        employer = new Employer();
        copy = (Employer)employer.clone();
        System.out.println("Employer == copy?");
        System.out.println(employer == copy);

        System.out.println("employer.getInformation() == copy.getInformation()?");
        System.out.println(employer.getInformation()==copy.getInformation());
    }
}
