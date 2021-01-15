package sy4_9;

public class Client_9 {
    public static void main(String[] args) {
        Handler handler = new Handler();

        Form form1 = (Form)XMLUtil.getBean("Web");
        handler.setForm(form1);
        handler.form();
        Form form2 = (Form)XMLUtil.getBean("Excel");
        handler.setForm(form2);
        handler.form();
        Form form3 = (Form)XMLUtil.getBean("Column");
        handler.setForm(form3);
        handler.form();

    }
}
