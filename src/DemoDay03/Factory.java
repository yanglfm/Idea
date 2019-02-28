package DemoDay03;

public class Factory extends Thread {
    private  Shelf shelf;
    private int count;

    public Factory(String name , Shelf shelf, int count) {
        super(name);
        this.shelf = shelf;
        this.count = count;
    }
    public void run(){

        for (int i=0;i<count;i++) {
            Product p=new Product();
            shelf.in(p);
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
