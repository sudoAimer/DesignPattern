package sy3_1;

public class DepartmentManager extends Leader {

    public DepartmentManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(OrderRequest request) {
        if(request.getPrice()<=50000) {
            System.out.println("主任" + name + "审批采购" + request.getGoodsName() + "的申请单，采购金额为" + request.getPrice());
        }
        else {
            if(this.successor!=null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
