package sy3_1;

public class OrderRequest {
    private String goodsName;
    private double price;

    public OrderRequest(String goodsName,double price) {
        this.goodsName = goodsName;
        this.price = price;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
