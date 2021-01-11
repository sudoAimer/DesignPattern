package sy3_1;

public class Client {
    public static void main(String args[]) {
        Leader one,two,three,four,meeting;
        one = new Director("陆涛");
        two = new DepartmentManager("路涛");
        three = new SubGeneralManager("卢涛");
        four = new GeneralManager("鲁陶");
        one.setSuccessor(two);
        two.setSuccessor(three);
        three.setSuccessor(four);

        OrderRequest order1 = new OrderRequest("玉米",9000);
        OrderRequest order2 = new OrderRequest("奶茶",22000);
        OrderRequest order3 = new OrderRequest("面粉",57000);
        OrderRequest order4 = new OrderRequest("坚果",13000);
        OrderRequest order5 = new OrderRequest("面条",220000);
        one.handleRequest(order1);
        one.handleRequest(order2);
        one.handleRequest(order3);
        one.handleRequest(order4);
        one.handleRequest(order5);
    }
}
