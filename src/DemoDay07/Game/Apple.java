package DemoDay07.Game;

public class Apple {
    @FruitName("ƻ��")//����൱�ڰ�ƻ����ע��������
    private String appleName;
    @FruitColor(fruitColor = FruitColor.Color.GREEN)
    private String  appleColor;
    @FruitProvider(id=1001,name = "�㽭ʡ�츻ʿ����",address = "�㽭ʡ������XXX·XXX��XXX����")
    private String  appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public static void main(String[] args) {

       FruitInfoUtil.getFruitInfo(Apple.class);
    }
}
