package sy2_3;

import java.util.ArrayList;

public class Folder extends  File{
    public ArrayList list = new ArrayList();//包含一个文件列表
    public void add(File file) {
        list.add(file);
    }

    public void remove(File file) {
        list.remove(file);
    }

    @Override
    public void shadu() {
        System.out.println("对文件夹中的每个文件杀毒");
//对文件夹杀毒等于遍历文件列表，对每一个文件杀毒
        for(Object object:list) {
            ((File)object).shadu();
        }
    }
}
