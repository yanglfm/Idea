package StudentMS.com.bochy.util;

public class Matches {

    public static boolean matchesTel(String tel){
        String regexTel="(13|15|18|17)\\d{9}";
        boolean flag=tel.matches(regexTel);
        return flag;
    }

    public static boolean matchesEmail(String email){
        String regexEmail="\\w+@\\w{2,4}(\\.)[comn]{2,3}";
        boolean flag=email.matches(regexEmail);
        return flag;
    }
    public static String matchesTel1(String tel){
        String regexTel="[1][3587]\\d{9}";
        if(tel.matches(regexTel)){
            return tel;
        }else {
            return null;
        }
    }
    public static String matchesTellphone(String tel){//选这个验证手机号
        String regexTel="^[1][34587]\\d{9}$";//^$分别表示行开头和行结尾
        if (tel.matches(regexTel)){
            return tel;
        }else {
            return null;
        }

    }

    public static String matchesEmail1(String email){
        String regexEmail="\\w+@\\w{2,4}(\\.)[comn]{2,3}";
        if(email.matches(regexEmail)){
            return email;
        }else {
            return null;
        }
    }
    public static int matchesAge(int age){

        if(age>=1 && age<=120){
            return age;
        }else {
            return 0;
        }
    }




    public static boolean matchesEmailX(String email){
        String regexEmail="\\w+@\\w{2,4}(\\.)[comn]{2,3}(\\.)[comn]{2,3}";
        boolean flag=email.matches(regexEmail);
        return flag;
    }
    public static void main(String[] args) {
        matchesEmail("sina@sina.com");
        System.out.println(matchesEmail("sina@sina.com"));
        System.out.println(matchesTel1("15555173209"));
        System.out.println(matchesTellphone("15555173209"));

    }
}
