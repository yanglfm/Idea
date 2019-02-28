package DemoDay03.Afternoon.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class IntergerStudy {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.lang.Integer");
        Field[] files = c.getFields();
        System.out.println(Modifier.toString(c.getModifiers()) + " " + c + " " + c.getSimpleName() + "{");
        for (Field file1 : files) {
            //??????????????
//            System.out.println(files[i].getModifiers());
            System.out.print("\t" + Modifier.toString(file1.getModifiers()));

            //??????
            System.out.print(" " + file1.getType());

            //?????????
            System.out.println(" " + file1.getName() + ";");
        }
        System.out.println("}");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Modifier.toString(c.getModifiers())).append(" class ").append(c.getSimpleName()).append("{\n");
        for (Field file : files) {
            stringBuffer.append("\t");
            stringBuffer.append(Modifier.toString(file.getModifiers())).append(" ");
            stringBuffer.append(file.getType()).append(" ");
            stringBuffer.append(file.getName()).append("\n");
        }
        stringBuffer.append("}");
        System.out.println(stringBuffer);
    }
}
