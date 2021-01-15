package sy4_5;

public class Employer implements Cloneable {
    private Information information = null;
    public Employer(){
        this.information = new Information();
    }
    public Employer clone(){
        Employer clone = null;
        try{
            clone = (Employer)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Clone failure");
        }
        return  clone;
    }
    public Information getInformation(){
        return this.information;
    }
    public void operation(){
        System.out.println("添加删除员工");
    }
}
