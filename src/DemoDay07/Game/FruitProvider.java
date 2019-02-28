package DemoDay07.Game;


import java.lang.annotation.*;
//水果供应商
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface  FruitProvider {
    //供应商的编号
    public int id() default -1;

    //供应商的名称
    public String name() default "";

    //供应商的地址
    public String address() default "";
}
