package DemoDay05.Evening.BankMoney;
//������ABͨ��һ���˻�A�ڹ�̨ȡǮ��B��ATM��ȡǮ��
//���������Ǯ������Ҫ���ó�һ����̬�ı�����������Ҫȡ��ͬһ������ֵ
public class Bank {
    //����һ���˻���1000��Ǯ
    static int money=1000;
    //��̨CounterȡǮ�ķ���
    public void Counter( int  money){//������ÿ��ȡ�ߵ�Ǯ
        Bank.money-=money;//ȡǮ����������
        System.out.println("Aȡ����"+money+"��ʣ��"+(Bank.money));
    }
    //ATMȡǮ�ķ���
    public void ATM(int money){//������ÿ��ȡ�ߵ�Ǯ
        Bank.money-=money;
        System.out.println("Bȡ����"+money+"��ʣ��"+(Bank.money));
    }
}
