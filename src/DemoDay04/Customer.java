package DemoDay04;

public class Customer {
    private String name;
    private int age;
    public Customer(String name, int age) {//���췽��
        this.name = name;
        this.age = age;
    }
    //��дtoString����
    @Override
    public String toString() {
        return "Customer [" +  name + "," + age +"]";
    }
}
