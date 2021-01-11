package sy2_1;

class Adapter implements Cat,Dog {
    //双向适配器类中包含目标类和适配类的引用
    private Cat cat;
    private Dog dog;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void catchMouse() {
        //适配器继承了Dog,Cat,所以重写catchMouse方法并调用bark()方法
        System.out.println("猫学狗叫");
        dog.bark();
    }

    @Override
    public void bark() {
        //适配器继承了Dog,Cat,所以重写bark()方法并调用catchMouse方法
        System.out.println("狗学猫抓老鼠");
        cat.catchMouse();
    }

}
