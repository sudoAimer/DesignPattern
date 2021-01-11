package sy1_9;

import java.io.IOException;

public class Client {
    public static void main(String[]args) throws IOException, ClassNotFoundException {
        //浅克隆
        System.out.println("浅克隆");
        Address address = new Address("黑龙江","黑河","逊克");
        Customer customer,copyCustomer;
        customer = new Customer();
        customer.setAddress(address);
        copyCustomer = (Customer)customer.clone();
        System.out.println("customer == copyCustomer");
        System.out.println(customer==copyCustomer);
        System.out.println("customer.getAddress == copyCustomer.getAddress");
        System.out.println(customer.getAddress()==copyCustomer.getAddress());

        //深克隆
        System.out.println("深克隆");
        copyCustomer = (Customer) customer.deepClone();
        System.out.println("customer == copyCustomer");
        System.out.println(customer==copyCustomer);
        System.out.println("customer.getAddress == copyCustomer.getAddress");
        System.out.println(customer.getAddress()==copyCustomer.getAddress());
    }
}
