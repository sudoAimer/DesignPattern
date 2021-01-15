package sy4_4;
import java.util.Date;

public class PersonalInformation {
    private String account; //账号
    private String password;//密码
    private boolean gender;//性别
    private String Department;//部门
    private Date date;//生日
    private Date loginTime;//登录日期
    private Integer level;//等级信息

    PersonalInformation(String account, String password, boolean gender, String Department, Date date, Date loginTime, Integer level){
        this.account = account;
        this.password = password;
        this.gender = gender;
        this.Department = Department;
        this.date = date;
        this.loginTime = loginTime;
        this.level = level;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
