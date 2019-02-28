package DemoDay0930;

import DemoDay0914.MyJFrame;
import StudentMS.com.bochy.entity.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class JTablePageTest extends MyJFrame {
    private int currentPage = 1;
    private int pageSize = 2;
    private int lastPage;
    JTable table = null;
    DefaultTableModel dtm = null;
    JScrollPane jsp = null;

    public static void main(String[] args) {
        System.out.println(3*0.1==0.3);
        System.out.println(3*0.1-0.3==0);
        for (int i = 1; i <=1000 ; i++) {
            if (i%5==0||i%6==0){
                    System.out.println(i);
            }
        }

    }

}


