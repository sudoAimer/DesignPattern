package sy4_8;

public class Commodity extends MySubject {
    @Override
    public void lack() {
        System.out.println("商品库存不够");
        for (Object obs : observers){
            ((Observer)obs).response();
        }
    }
}