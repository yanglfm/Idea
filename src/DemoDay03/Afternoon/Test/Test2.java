package DemoDay03.Afternoon.Test;


import java.util.Date;

public class Test2<c> {//可变长参数练习
    public static void main(String[] args) {

        Test2.show("体育","美术","电脑","旅游");
        //定义数组
        String  []strs={"体育","美术","电脑","旅游"};
        Test2.show(strs);
        //可以直接传参，或者数组
        //将不同类型的数据传入输出
        Date  d=new Date();
        Object obj=new Object();
        String str=new String();
        Test2.show1(d,obj,str);//通过调用书写Object的长参数方法
        Test2.show2(Date.class,Object.class,String.class);
        //或者写为
        Test2.show2(d.getClass(),obj.getClass(),str.getClass());
    }
    //书写String类型的可变长参数
    public static void show(String...strings){//可变长参数，把strings即传过来的参数当做一个数组了，做一个循环输出就可以了
        for(int i=0;i<strings.length;i++){//这是一个数组
            System.out.println(strings[i]);
        }
    }
    //传入得参数是对象？？？？Date String Demo
    public static void show1(Object...objects){//可变长参数，把strings即传过来的参数当做一个数组了，做一个循环输出就可以了
        for(int i=0;i<objects.length;i++){//这是一个数组
            System.out.println(objects[i]);
        }
    }
    //用Class表示，书写Class类型的可变长参数
    public static void show2(Class...c){//可变长参数，把strings即传过来的参数当做一个数组了，做一个循环输出就可以了
        for(int i=0;i<c.length;i++){//这是一个数组
            System.out.println(c[i]);
        }
    }
}
