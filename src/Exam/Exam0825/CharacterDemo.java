package Exam.Exam0825;

public class CharacterDemo extends Thread{
    Second s;

    public CharacterDemo(Second s) {
        this.s = s;
    }
    public void run(){
            try {
                s.showCharacter(s);
                s.wait();
                s.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

