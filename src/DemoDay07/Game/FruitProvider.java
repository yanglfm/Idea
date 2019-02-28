package DemoDay07.Game;


import java.lang.annotation.*;
//ˮ����Ӧ��
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface  FruitProvider {
    //��Ӧ�̵ı��
    public int id() default -1;

    //��Ӧ�̵�����
    public String name() default "";

    //��Ӧ�̵ĵ�ַ
    public String address() default "";
}
