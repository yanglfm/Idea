package DemoDay05.Evening.BankMoney;

public class PersonA extends Thread{
    //�������ж���
    Bank bank;
    //ͨ���������������ж���ȷ�������˽������ͬһ������
    public PersonA(Bank bank) {
        this.bank = bank;
    }
    //��дrun������������ʵ��ʹ�ù�̨ȡǮ
    public void run(){
        while(Bank.money>=100){
            bank.Counter(100);//ÿ��ȡһ��
        }
        try {
            sleep(100);//ȡ����Ϣ0.1��
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
