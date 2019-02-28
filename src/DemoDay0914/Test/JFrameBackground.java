package DemoDay0914.Test;


    import java.awt.*;

    import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

    public class JFrameBackground {

        private JFrame frame = new JFrame("背景图片测试");

        private JPanel imagePanel;

        private ImageIcon background;

     /*   public static void main(String[] args) {
            new JFrameBackground();
        }

        public JFrameBackground() {
            background = new ImageIcon("D:\\Program Files\\GoogleChrome\\Photo\\07.jpg");// 背景图片
            JLabel label = new JLabel(background);// 把背景图片显示在一个标签里面
            // 把标签的大小位置设置为图片刚好填充整个面板
            label.setBounds(0, 0, background.getIconWidth(),
                    background.getIconHeight());
            // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
            imagePanel = (JPanel) frame.getContentPane();
            imagePanel.setOpaque(false);
            // 内容窗格默认的布局管理器为BorderLayout
            imagePanel.setLayout(new FlowLayout());
            imagePanel.add(new JButton("测试按钮"));

            frame.getLayeredPane().setLayout(null);
            // 把背景图片添加到分层窗格的最底层作为背景
            frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(background.getIconWidth(), background.getIconHeight());
            frame.setResizable(false);
            frame.setVisible(true);
        }*/
        public static void main(String[]args){
            JFrame frame=new JFrame("背景图设置");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon img=new ImageIcon("D:\\Program Files\\GoogleChrome\\Photo\\07.jpg");//这是背景图片???
            JLabel imgLabel =new JLabel(img);//将背景图放在标签里。?????
            frame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。???
            imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());//设置背景标签的位置???
            Container cp=frame.getContentPane();
            cp.setLayout(new BorderLayout());
            JButton but=new JButton("anniu");//创建按钮??
            cp.add(but,"North");//将按钮添加入窗口的内容面板?????
            ((JPanel)cp).setOpaque(false);//注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。?????
            frame.setSize(500,300);frame.setVisible(true);
        }

    }


