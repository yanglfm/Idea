package DemoDay2.DemoDay2.Test;

public class TestDemo {
    public static void main(String[] args) {
        Ticket t=new Ticket();
        ThreadDemo t1=new ThreadDemo(t,"����1");
        ThreadDemo t2=new ThreadDemo(t,"����2");
        ThreadDemo t3=new ThreadDemo(t,"����3");
        t1.start();
        t2.start();
        t3.start();

    }
}
