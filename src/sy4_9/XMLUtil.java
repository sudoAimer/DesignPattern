package sy4_9;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(String args){
        try {
            //创建一个文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = builder.parse(new File("src\\sy4_9\\Config.xml"));
            //获取包含类名的文本节点
            NodeList nodeList;
            Node classNode = null;
            String className;
            nodeList = document.getElementsByTagName("classname");
            if (args.equals("Web")){
                classNode = nodeList.item(0).getFirstChild();
            } else if(args.equals("Excel")){
                classNode = nodeList.item(1).getFirstChild();
            }else if (args.equals("Column")){
                classNode = nodeList.item(2).getFirstChild();
            }
            className = classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName("sy4_9." + className);
            Object object = c.newInstance();
            return object;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
