import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
public class MyFrame implements ActionListener {//หน้าแรก
    JLabel jl = new JLabel();
    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    JButton jb = new JButton();
    MyFrame(){
        ImageIcon icon = new ImageIcon("src/emojiPNG (2).png");
        ImageIcon icon2 = new ImageIcon("src/emojiPNG.png");

        jf.setTitle("grade calculator");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(800, 500);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.getContentPane().setBackground(new Color(28 ,28, 28));
        jf.setIconImage(icon2.getImage());
        jf.setLocationRelativeTo(null);

        jl.setText("Wlcome grade calculator program");//หัวข้อ
        jl.setFont(new Font("MV boli",Font.PLAIN,40));
        jl.setBounds(80,10,5000,100);
        jl.setForeground(new Color(255 ,185, 15));

        jp.setBounds(0,30,1000,100);
        jp.setLayout(null);
        jp.setBackground(new Color(54 ,54, 54));
        jp.add(jl);
        jf.add(jp);

        jb.setBounds(290, 250, 200, 100);
        jb.setPreferredSize(new Dimension(500,250));
        jb.addActionListener(this);
        jb.setText("Click here to begin");
        jb.setFont(new Font("Comic sans",Font.PLAIN,15));
        jb.setIcon(icon);
        jb.setHorizontalTextPosition(jb.CENTER);
        jb.setVerticalTextPosition(JButton.BOTTOM);
        jb.setIconTextGap(0);
        jb.setForeground(new Color(0 ,0, 0));
        jb.setBackground(new Color(205 ,149, 12));
        jb.setBorder(BorderFactory.createEtchedBorder());
        jf.add(jb);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb){
            Mygrade lp = new Mygrade();
            jf.dispose();
        }
    }
}
