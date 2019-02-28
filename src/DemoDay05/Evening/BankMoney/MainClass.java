package DemoDay05.Evening.BankMoney;

public class MainClass {
    //两个人AB通过一个账户A在柜台取钱和B在ATM机取钱
    public static void main(String[] args) {
        //实例化一个银行对象
        Bank bank=new Bank();
        //实例化两个人
        PersonA A=new PersonA(bank);
        PersonB B=new PersonB(bank);
        //两个人开始取钱
        A.start();
        B.start();

    }
}
