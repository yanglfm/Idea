package DemoDay05.Evening.BankMoney;

public class MainClass {
    //������ABͨ��һ���˻�A�ڹ�̨ȡǮ��B��ATM��ȡǮ
    public static void main(String[] args) {
        //ʵ����һ�����ж���
        Bank bank=new Bank();
        //ʵ����������
        PersonA A=new PersonA(bank);
        PersonB B=new PersonB(bank);
        //�����˿�ʼȡǮ
        A.start();
        B.start();

    }
}
