package DemoDay0914.Test;


    import java.awt.*;

    import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

    public class JFrameBackground {

        private JFrame frame = new JFrame("����ͼƬ����");

        private JPanel imagePanel;

        private ImageIcon background;

     /*   public static void main(String[] args) {
            new JFrameBackground();
        }

        public JFrameBackground() {
            background = new ImageIcon("D:\\Program Files\\GoogleChrome\\Photo\\07.jpg");// ����ͼƬ
            JLabel label = new JLabel(background);// �ѱ���ͼƬ��ʾ��һ����ǩ����
            // �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
            label.setBounds(0, 0, background.getIconWidth(),
                    background.getIconHeight());
            // �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��
            imagePanel = (JPanel) frame.getContentPane();
            imagePanel.setOpaque(false);
            // ���ݴ���Ĭ�ϵĲ��ֹ�����ΪBorderLayout
            imagePanel.setLayout(new FlowLayout());
            imagePanel.add(new JButton("���԰�ť"));

            frame.getLayeredPane().setLayout(null);
            // �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
            frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(background.getIconWidth(), background.getIconHeight());
            frame.setResizable(false);
            frame.setVisible(true);
        }*/
        public static void main(String[]args){
            JFrame frame=new JFrame("����ͼ����");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon img=new ImageIcon("D:\\Program Files\\GoogleChrome\\Photo\\07.jpg");//���Ǳ���ͼƬ???
            JLabel imgLabel =new JLabel(img);//������ͼ���ڱ�ǩ�?????
            frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����???
            imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());//���ñ�����ǩ��λ��???
            Container cp=frame.getContentPane();
            cp.setLayout(new BorderLayout());
            JButton but=new JButton("anniu");//������ť??
            cp.add(but,"North");//����ť����봰�ڵ��������?????
            ((JPanel)cp).setOpaque(false);//ע����������������Ϊ͸��������LayeredPane����еı���������ʾ������?????
            frame.setSize(500,300);frame.setVisible(true);
        }

    }


