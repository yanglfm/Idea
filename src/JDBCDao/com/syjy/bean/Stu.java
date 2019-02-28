package JDBCDao.com.syjy.bean;

import java.sql.Date;

public class Stu {
    //定义字段
    private int stuid;
    private String stuName;
    private int age;
    private String sex;
    private Date birthday;
    private String tel;
    private String email;
    private String address;

    public Stu() {
        super();
        // TODO 自动生成的构造函数存根
    }

    public Stu(int stuid, String stuName, int age, String sex, Date birthday, String tel, String email,
               String address) {
        super();
        this.stuid = stuid;
        this.stuName = stuName;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
