package sy4_9;

public class Handler {
    private Form form;
    public void setForm(Form form){
        this.form = form;
    }
    public void form(){
        String str = form.toString();
        String str1 = str.substring(4, str.indexOf("@"));
        System.out.println("以"+ str1+ "方式执行每日结账查询，报表打印，每月的统计汇总查询");
    }
}

