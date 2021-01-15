package sy4_2;

import java.util.ArrayList;

public class Department extends AbstractElement {

    private ArrayList<AbstractElement> list = new ArrayList<AbstractElement>();

    @Override
    void add(AbstractElement abstractElement)//添加员工
    {
        list.add(abstractElement);
    }
    @Override
    void remove(AbstractElement abstractElement){
        list.remove(abstractElement);
    }//删除
    @Override
    void getAll(){
        for(Object object:list)
        {
            ((AbstractElement)object).GetInformation();
        }
    }//得到全部信息

}
