package DemoDay0914.Test;


import javax.swing.*;


public class ImageDemo1  {


    public ImageDemo1() {
        //����ͼƬ
        ImageIcon icon = new ImageIcon("D:\\Program Files\\GoogleChrome\\Photo\\07.jpg");
        //Image im=new Image(icon);
        //��ͼƬ����label��
        JLabel label = new JLabel(icon);

        //����label�Ĵ�С
        label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());

        JFrame frame = new JFrame();

        //��ȡ���ڵĵڶ��㣬��label����
        frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));

        //��ȡframe�Ķ�������,������Ϊ͸��
        JPanel j = (JPanel) frame.getContentPane();
        j.setOpaque(false);

        JPanel panel = new JPanel();
        JTextField jta = new JTextField(10);
        //JTextArea jta=new JTextArea(10,60);
        JButton jb = new JButton("ȷ��");
        JButton jb2 = new JButton("����");

        panel.add(jta);
        panel.add(jb);
        panel.add(jb2);

        //��������Ϊ͸���ġ����򿴲���ͼƬ
        panel.setOpaque(false);

        frame.add(panel);
        frame.add(panel);
        frame.setSize(icon.getIconWidth(), icon.getIconHeight());
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new ImageDemo1();
    }


}
