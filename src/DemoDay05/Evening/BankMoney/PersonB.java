package DemoDay05.Evening.BankMoney;

public class PersonB extends Thread{
    //�������ж���
    Bank bank;
    //ͨ���������������ж���ȷ�������˽������ͬһ������
    public PersonB(Bank bank) {
        this.bank = bank;
    }
    //��дrun������������ʵ��ʹ�ù�̨ȡǮ

    @Override
    public void run() {
        while (Bank.money>=200){
            bank.ATM(200);
            try {
                sleep(100);//ȡ����Ϣ0.1��
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
