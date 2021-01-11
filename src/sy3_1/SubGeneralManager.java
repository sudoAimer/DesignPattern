package sy3_1;

public class SubGeneralManager extends Leader {
    public SubGeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(OrderRequest request) {
        if(request.getPrice()<=100000) {
            System.out.println("主任" + name + "审批采购" + request.getGoodsName() + "的申请单，采购金额为" + request.getPrice());
        }
        else {
            if(this.successor!=null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
