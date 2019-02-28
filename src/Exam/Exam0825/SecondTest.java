package Exam.Exam0825;

public class SecondTest {
    public static void main(String[] args) {
        Second s=new Second();
        NumDemo n=new NumDemo(s);
        CharacterDemo c=new CharacterDemo(s);
        n.start();
        c.start();
    }
}
