package DemoDay2.DemoDay2.Test.DemoDay2.Homework;

public class User extends Thread{
    private Toilet toilet;
    public User(String name,Toilet toilet){
        super(name);
        this.toilet=toilet;
    }

    public User() {

    }

    public void run(){
        //�����û�����
         User user=new User(Thread.currentThread().getName(),toilet);
            toilet.line(user);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



