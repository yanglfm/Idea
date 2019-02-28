package DemoDay2.DemoDay2.Test;

public class TestDemo {
    public static void main(String[] args) {
        Ticket t=new Ticket();
        ThreadDemo t1=new ThreadDemo(t,"´°¿Ú1");
        ThreadDemo t2=new ThreadDemo(t,"´°¿Ú2");
        ThreadDemo t3=new ThreadDemo(t,"´°¿Ú3");
        t1.start();
        t2.start();
        t3.start();

    }
}
