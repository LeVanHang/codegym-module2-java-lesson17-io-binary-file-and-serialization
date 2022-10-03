package student;

import javax.xml.crypto.Data;
import java.util.Date;

public class Student {
    private String name;
    private String gender;
    private int age;
    private String phone;
    private Date birthday;
    private Classs classs;

    public Student() {
    }

    public Student(String name, String gender, int age, String phone, Date birthday, Classs classs) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.birthday =  birthday;
        this.classs = classs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Data birthday) {
        this.birthday = (Date) birthday;
    }

    public Classs getClasss() {
        return classs;
    }

    public void setClasss(Classs classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", classs=" + classs.toString() +
                '}';
    }
}
