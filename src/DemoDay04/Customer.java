package DemoDay04;

public class Customer {
    private String name;
    private int age;
    public Customer(String name, int age) {//构造方法
        this.name = name;
        this.age = age;
    }
    //重写toString方法
    @Override
    public String toString() {
        return "Customer [" +  name + "," + age +"]";
    }
}
