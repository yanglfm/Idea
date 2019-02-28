package DemoDay07.Game;
//水果颜色


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)//运行期有效
@Documented
public @interface FruitColor {
    //颜色的枚举
    public enum Color{BULE,RED,GREEN};
    //属性值的设定
    Color fruitColor() default Color.RED;
}
