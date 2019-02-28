package DemoDay07.Game;

import java.lang.annotation.*;
//Field只能手动添加

//水果名称
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
