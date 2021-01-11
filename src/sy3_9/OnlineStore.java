package sy3_9;

import java.util.ArrayList;

public class OnlineStore {
    protected ArrayList members = new ArrayList();

    public void attach(Member member) {
        members.add(member);
    }

    public void updateName() {
        System.out.println("Product's name changes!");
        for(Object obj:members) {
            ((Member)obj).updateName();
        }
    }

    public void updatePrice() {
        System.out.println("Product's price changes!");
        for(Object obj:members) {
            ((Member)obj).updatePrice();
        }
    }
}
