package DemoDay07.Game;
//ˮ����ɫ


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)//��������Ч
@Documented
public @interface FruitColor {
    //��ɫ��ö��
    public enum Color{BULE,RED,GREEN};
    //����ֵ���趨
    Color fruitColor() default Color.RED;
}
