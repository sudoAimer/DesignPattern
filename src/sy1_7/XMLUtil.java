package sy1_7;
import org.w3c.dom.*;
import javax.xml.parsers.*;

import java.io.File;
public class XMLUtil {
    public static Object getBean(){
        try
        {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            //获取包含性别名称的文本节点
            NodeList nl = doc.getElementsByTagName("person");
            Node personNode=nl.item(0).getFirstChild();
            String person=personNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c=Class.forName(person);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}