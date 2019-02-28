package StudentMS.com.bochy.entity;

import java.util.Objects;

public class Student {
    //�����ֶ�
    private int stuid;
    private String stuName;
    private String sex;
    private int age;
    private String classType;
    private String address;
    private String tel;
    private String email;

    public Student() {
    }

    public Student(int stuid, String stuName, String sex, int age, String classType, String address, String tel, String email) {
        this.stuid = stuid;
        this.stuName = stuName;
        this.sex = sex;
        this.age = age;
        this.classType = classType;
        this.address = address;
        this.tel = tel;
        this.email = email;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public boolean equals(Object o) {//��дequals����
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuid == student.stuid &&
                age == student.age &&
                Objects.equals(stuName, student.stuName) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(classType, student.classType) &&
                Objects.equals(address, student.address) &&
                Objects.equals(tel, student.tel) &&
                Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuid, stuName, sex, age, classType, address, tel, email);
    }

    @Override
    public String toString() {
        return "|ѧ��" + "\t\t" +"|����" +  "\t\t" +"|����" + "\t\t" +"|�Ա�" + "\t\t" +"|�꼶" + "\t\t"+"|�绰" + "\t\t\t\t" +"|Email" + "\t\t\t\t" +"|��ַ"+"\n"+

                "|"+stuid + "\t\t\t" + "|"+stuName +  "\t\t" +"|"+age+ "\t\t\t" +"|"+sex+ "\t\t\t" +"|"+classType + "\t\t" +"|"+tel +  "\t\t" +"|"+email + "\t\t" +"|"+address;

    }
}
