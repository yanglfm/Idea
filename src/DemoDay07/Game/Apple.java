package DemoDay07.Game;

public class Apple {
    @FruitName("苹果")//这就相当于把苹果打到注解里面了
    private String appleName;
    @FruitColor(fruitColor = FruitColor.Color.GREEN)
    private String  appleColor;
    @FruitProvider(id=1001,name = "浙江省红富士集团",address = "浙江省宁波市XXX路XXX街XXX大厦")
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
