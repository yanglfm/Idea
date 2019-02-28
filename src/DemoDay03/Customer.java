package DemoDay03;

public class Customer extends Thread{
    //将货架作为属性
    private Shelf shelf;
    private  int count;
    public Customer(String name,Shelf shelf, int count) {
        super(name);
        this.shelf = shelf;
        this.count = count;
    }
    public void  run(){

        for (int i=0;i<count;i++) {
            shelf.out();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
