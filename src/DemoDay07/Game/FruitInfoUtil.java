package DemoDay07.Game;

import java.lang.reflect.Field;

public class FruitInfoUtil {//工具类
    public static void getFruitInfo(Class<?> clazz){//这里传入类
        String strFruitName="水果名称：";
        String strFruitColor="水果颜色：";
        String strFruitProvider="供应商的信息：";
        //通过反射获取类中字段信息
        Field fields[] = clazz.getDeclaredFields();
        //遍历字段
        for (Field field : fields) {
            //是否是FruitName注解
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);//这也是一个接口
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);//
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }else if (field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider=strFruitProvider+"供应商的编号："+fruitProvider.id()+"供应商的名称："+fruitProvider.name()+"供应商的地址："+fruitProvider.address();
                System.out.println(strFruitProvider);
            }

        }
    }
}
