package DemoDay07.Game;

import java.lang.reflect.Field;

public class FruitInfoUtil {//������
    public static void getFruitInfo(Class<?> clazz){//���ﴫ����
        String strFruitName="ˮ�����ƣ�";
        String strFruitColor="ˮ����ɫ��";
        String strFruitProvider="��Ӧ�̵���Ϣ��";
        //ͨ�������ȡ�����ֶ���Ϣ
        Field fields[] = clazz.getDeclaredFields();
        //�����ֶ�
        for (Field field : fields) {
            //�Ƿ���FruitNameע��
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);//��Ҳ��һ���ӿ�
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);//
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }else if (field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider=strFruitProvider+"��Ӧ�̵ı�ţ�"+fruitProvider.id()+"��Ӧ�̵����ƣ�"+fruitProvider.name()+"��Ӧ�̵ĵ�ַ��"+fruitProvider.address();
                System.out.println(strFruitProvider);
            }

        }
    }
}
