package sy2_1;

public class Client {
    public static void main(String[]args){
        Cat concreateCat = new ConcreateCat();
        Dog concreateDog = new ConcreateDog();
        Adapter adapter = new Adapter();
//注入目标类和适配者类的引用
        adapter.setCat(concreateCat);
        adapter.setDog(concreateDog);
        adapter.bark();
        adapter.catchMouse();
    }
}
