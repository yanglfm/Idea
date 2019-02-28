package DemoDay05.Afternoon;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
   transient private int age;
    public static final long SerializableUID=12346456789L;//ָ���Ƿ���ͬһ�汾

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[" + "name=" + name + ", age=" + age + ']';
    }
}

