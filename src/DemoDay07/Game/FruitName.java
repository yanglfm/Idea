package DemoDay07.Game;

import java.lang.annotation.*;
//Fieldֻ���ֶ����

//ˮ������
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
