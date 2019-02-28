package DemoDay03;

import java.util.ArrayList;

//用户和
public class Shelf {//创建货架
    //定义货架上的数目的最大值，最多可以放多少个货物
    private int count;
    //定义货架上货物，因为货物多种多样，所以用集合表示
    private ArrayList<Product>products=new ArrayList<Product>();
    //上货和卖出

    public Shelf(int count) {
        this.count = count;

    }

    public synchronized void in(Product p){//把商品作为形式参数传过来
        while(products.size()>=count){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products.add(p);
        System.out.println(Thread.currentThread().getName()+"正在加货，货架上有"+products.size()+"这么多商品");
        notifyAll();

    }
    public synchronized void out(){
        //货架上是空的，消费者就等待
        while(products.size()==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products.remove(0);//货架不是空的话，消费者买走货物
        System.out.println(Thread.currentThread().getName()+"买走商品，当前货架上的商品有"+products.size()+"个");
        notifyAll();//唤醒


    }
}
