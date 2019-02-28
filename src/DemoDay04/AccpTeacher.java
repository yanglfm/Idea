package DemoDay04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AccpTeacher {
    private String name;

    private int age;

    public AccpTeacher() {
        name = "������";
        age = 22;
    }

    public AccpTeacher(String name,int age) {
        this.name = name;
        this.age = 22;
    }

    public String toString() {
        return "������:" + name;
    }

    public String toString(int age, String name) {
        this.name = name;
        this.age = age;
        return "������:" + name + "�������ǣ�" + age;
    }
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        // ͨ�����췽��ʵ����һ����;������һ���в����Ĺ��캯�������ҹ��캯������Ϊprivate����
        Class[] argtype = new Class[] { String.class };//�����췽���Ĳ�����������
        Object[] argparam = new Object[] { "����" };//�����췽���Ĳ���ֵ����
        Class classType = Class.forName(AccpTeacher.class.getName());
        Constructor constructor = classType.getDeclaredConstructor(argtype); //��ù��췽����argtype�ǲ����������飬�������������ǲ���ֻ��һ��String����
        constructor.setAccessible(true);// ����˽�й��캯��,Spring��������˽�е����Ժͷ�������ʵ�����õ�������
        Object accpTeacher2 = constructor.newInstance(argparam);
        System.out.println(accpTeacher2);
    }
}
