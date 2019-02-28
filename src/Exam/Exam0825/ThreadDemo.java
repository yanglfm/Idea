package Exam.Exam0825;

class PrintNumChar {
    private boolean flag = false;
    public static void main(String[] args) {
        PrintNumChar printNumChar = new PrintNumChar();
        Thread printChar = new Thread(printNumChar.printChar);
        Thread printNum = new Thread(printNumChar.printNum);
        printNum.start();
        printChar.start();
    }
    private synchronized void printNum(int num) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(num * 2 - 1);
        System.out.print(num * 2);
        flag = true;
        notify();
    }
    private synchronized void printChar(int i) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((char) ('A' + i ));
        flag = false;
        notify();
    }

    private Runnable printNum = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 26; i++) {
                printNum(i + 1);
            }
        }
    };

    private Runnable printChar = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 26; i++) {
                printChar(i);
            }
        }
    };
}
