package sy3_1;

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(OrderRequest request) {
        if(request.getPrice()<=200000) {
            System.out.println("主任" + name + "审批采购" + request.getGoodsName() + "的申请单，采购金额为" + request.getPrice());
        }
        else {
            System.out.println("采购金额为" + request.getPrice() + ",数额巨大，需要通过会议审核！");
        }
    }
}
