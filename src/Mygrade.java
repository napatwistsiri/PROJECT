import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Mygrade implements ActionListener {
    Double a,a1,a2,a3,a4,a5,a6,a7;
    Double b,b1,b2,b3,b4,b5,b6,b7;
    Double c,grageans ;

    JLabel jl = new JLabel();
    JFrame jf = new JFrame();
    JButton jb = new JButton();
    JButton jb2 = new JButton();

    JLabel imagel = new JLabel();
    ImageIcon icon = new ImageIcon("src/emoji_like (2).png");


    JLabel show = new JLabel();
    JLabel show2 = new  JLabel();

    JPanel write = new JPanel();
    JPanel write2 = new JPanel();
    JPanel write3 = new JPanel();

    String[] Theme = {"Light mode","Dark mode"};
    JComboBox settheme = new JComboBox(Theme);



    String[] subject = {"--","1","2","3","4"};
    JComboBox jc0 = new JComboBox(subject);
    JComboBox jc1 = new JComboBox(subject);
    JComboBox jc2 = new JComboBox(subject);
    JComboBox jc3 = new JComboBox(subject);
    JComboBox jc4 = new JComboBox(subject);
    JComboBox jc5 = new JComboBox(subject);
    JComboBox jc6 = new JComboBox(subject);
    JComboBox jc7 = new JComboBox(subject);

    String[] grage = {"--","A","B+","B","C+","C","D+","D","F"};
    JComboBox gr0 = new JComboBox(grage);
    JComboBox gr1 = new JComboBox(grage);
    JComboBox gr2 = new JComboBox(grage);
    JComboBox gr3 = new JComboBox(grage);
    JComboBox gr4 = new JComboBox(grage);
    JComboBox gr5 = new JComboBox(grage);
    JComboBox gr6 = new JComboBox(grage);
    JComboBox gr7 = new JComboBox(grage);

    JLabel grade1 = new JLabel();
    JLabel grade = new JLabel();
    JLabel subtutal = new JLabel();
    JLabel sub = new JLabel();
    JLabel sub0 = new JLabel();
    JLabel sub1 = new JLabel();
    JLabel sub2 = new JLabel();
    JLabel sub3 = new JLabel();
    JLabel sub4 = new JLabel();
    JLabel sub5 = new JLabel();
    JLabel sub6 = new JLabel();
    JLabel sub7 = new JLabel();

    JTextField text0 = new JTextField();
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();
    JTextField text5 = new JTextField();
    JTextField text6 = new JTextField();
    JTextField text7 = new JTextField();

    Mygrade(){
        ImageIcon icon = new ImageIcon("emojiPNG(1).png");
        jf.setTitle("check grage");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(1000, 1000);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);

        jb.setBounds(10, 800, 60, 30);
        jb.setPreferredSize(new Dimension(500,250));
        jb.addActionListener(this);
        jb.setText("Back");
        jb.setFont(new Font("MV boli",Font.PLAIN,10));
        jb.setFocusable(false);
        jb.setIcon(icon);
        jb.setHorizontalTextPosition(jb.CENTER);
        jb.setVerticalTextPosition(JButton.BOTTOM);
        jb.setForeground(new Color(0 ,0, 0));
        jb.setBackground(new Color(232 ,232, 232));
        jb.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        jf.add(jb);

        write2.setBounds(100,150,800,500);
        write2.setLayout(null);
        write2.setBackground(new Color(220 ,220, 220));

        jb2.setBounds(500, 400, 60, 30);
        jb2.setPreferredSize(new Dimension(500,250));
        jb2.addActionListener(this);
        jb2.setText("Total");
        jb2.setFont(new Font("MV boli",Font.PLAIN,10));
        jb2.setFocusable(false);
        jb2.setIcon(icon);
        jb2.setHorizontalTextPosition(jb.CENTER);
        jb2.setVerticalTextPosition(JButton.BOTTOM);
        jb2.setForeground(new Color(0 ,0, 0));
        jb2.setBackground(new Color(232 ,232, 232));
        jb2.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        jb2.addActionListener(this);
        write2.add(jb2);
        jf.add(write2);



        jl.setText("Grade calculator program");//หัวข้อ
        jl.setFont(new Font("MV boli",Font.PLAIN,60));
        jl.setBounds(130,10,5000,100);
        jl.setForeground(new Color(0, 0, 0));


        write.setBounds(10,10,950,100);
        write.setLayout(null);
        write.setBackground(new Color(220 ,220, 220));
        write.add(jl);
        jf.add(write);

        settheme.setBounds(130,120,150,30);
        settheme.addActionListener(this);
        settheme.setSelectedIndex(1);
        jf.add(settheme);

        //หัวข้อ
        subtutal.setBounds(10, 20, 1000, 20);
        subtutal.setFont(new Font("MV boli",Font.PLAIN,15));
        subtutal.setText("Select the grade you want to calculate.");
        write2.add(subtutal);

        grade.setBounds(220,90,100,30);
        grade.setText("   Grade credits");
        grade.setBorder(BorderFactory.createLineBorder(Color.black));
        write2.add(grade);

        grade1.setBounds(430,90,70,30);
        grade1.setText("         Grade ");
        grade1.setBorder(BorderFactory.createLineBorder(Color.black));
        write2.add(grade1);



        sub.setText("Subject !!!");

        sub.setBounds(100,90,400,30);
        sub0.setBounds(100,120,400,30);
        sub1.setBounds(100,150,400,30);
        sub2.setBounds(100,180,400,30);
        sub3.setBounds(100,210,400,30);
        sub4.setBounds(100,240,400,30);
        sub5.setBounds(100,270,400,30);
        sub6.setBounds(100,300,400,30);
        sub7.setBounds(100,330,400,30);
        sub.setBorder(BorderFactory.createLineBorder(Color.black));
        sub0.setBorder(BorderFactory.createLineBorder(Color.black));
        sub1.setBorder(BorderFactory.createLineBorder(Color.black));
        sub2.setBorder(BorderFactory.createLineBorder(Color.black));
        sub3.setBorder(BorderFactory.createLineBorder(Color.black));
        sub4.setBorder(BorderFactory.createLineBorder(Color.black));
        sub5.setBorder(BorderFactory.createLineBorder(Color.black));
        sub6.setBorder(BorderFactory.createLineBorder(Color.black));
        sub7.setBorder(BorderFactory.createLineBorder(Color.black));

        write2.add(sub);
        write2.add(sub0);
        write2.add(sub1);
        write2.add(sub2);
        write2.add(sub3);
        write2.add(sub4);
        write2.add(sub5);
        write2.add(sub6);
        write2.add(sub7);
        jf.add(write2);

        text0.setBounds(100, 120, 100, 30);
        text1.setBounds(100, 150, 100, 30);
        text2.setBounds(100, 180, 100, 30);
        text3.setBounds(100, 210, 100, 30);
        text4.setBounds(100, 240, 100, 30);
        text5.setBounds(100, 270, 100, 30);
        text6.setBounds(100, 300, 100, 30);
        text7.setBounds(100, 330, 100, 30);
        text0.setText("Subject 1");
        text1.setText("Subject 2");
        text2.setText("Subject 3");
        text3.setText("Subject 4");
        text4.setText("Subject 5");
        text5.setText("Subject 6");
        text6.setText("Subject 7");
        text7.setText("Subject 8");
        write2.add(text0);
        write2.add(text1);
        write2.add(text2);
        write2.add(text3);
        write2.add(text4);
        write2.add(text5);
        write2.add(text6);
        write2.add(text7);

        jc0.addActionListener(this);
        jc1.addActionListener(this);
        jc2.addActionListener(this);
        jc3.addActionListener(this);
        jc4.addActionListener(this);
        jc5.addActionListener(this);
        jc6.addActionListener(this);
        jc7.addActionListener(this);
        jc0.setBounds(250,120,40,30);
        jc1.setBounds(250,150,40,30);
        jc2.setBounds(250,180,40,30);
        jc3.setBounds(250,210,40,30);
        jc4.setBounds(250,240,40,30);
        jc5.setBounds(250,270,40,30);
        jc6.setBounds(250,300,40,30);
        jc7.setBounds(250,330,40,30);
        jc0.setSelectedIndex(0);
        jc1.setSelectedIndex(0);
        jc2.setSelectedIndex(0);
        jc3.setSelectedIndex(0);
        jc4.setSelectedIndex(0);
        jc5.setSelectedIndex(0);
        jc6.setSelectedIndex(0);
        jc7.setSelectedIndex(0);

        write2.add(jc0);
        write2.add(jc1);
        write2.add(jc2);
        write2.add(jc3);
        write2.add(jc4);
        write2.add(jc5);
        write2.add(jc6);
        write2.add(jc7);
        jf.add(write2);

        gr0.addActionListener(this);
        gr1.addActionListener(this);
        gr2.addActionListener(this);
        gr3.addActionListener(this);
        gr4.addActionListener(this);
        gr5.addActionListener(this);
        gr6.addActionListener(this);
        gr7.addActionListener(this);
        gr0.setBounds(460,120,40,30);
        gr1.setBounds(460,150,40,30);
        gr2.setBounds(460,180,40,30);
        gr3.setBounds(460,210,40,30);
        gr4.setBounds(460,240,40,30);
        gr5.setBounds(460,270,40,30);
        gr6.setBounds(460,300,40,30);
        gr7.setBounds(460,330,40,30);
        gr0.setSelectedIndex(0);
        gr1.setSelectedIndex(0);
        gr2.setSelectedIndex(0);
        gr3.setSelectedIndex(0);
        gr4.setSelectedIndex(0);
        gr5.setSelectedIndex(0);
        gr6.setSelectedIndex(0);
        gr7.setSelectedIndex(0);
        write2.add(gr0);
        write2.add(gr1);
        write2.add(gr2);
        write2.add(gr3);
        write2.add(gr4);
        write2.add(gr5);
        write2.add(gr6);
        write2.add(gr7);
        jf.add(write2);

        imagel.setIcon(icon);
        imagel.setBounds(300,700,100,200);
        imagel.setVisible(false);
        jf.add(imagel);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb){
            MyFrame lp = new MyFrame();
            jf.dispose();
        }


        //1
        if(e.getSource()==jc0){

            if(jc0.getSelectedIndex()==1){
                a=1.0;
            }else if(jc0.getSelectedIndex()==2){
                a=2.0;
            }else if(jc0.getSelectedIndex()==3){
                a=3.0;
            }else if(jc0.getSelectedIndex()==4){
                a=4.0;
            }else if(jc0.getSelectedIndex()==0){
                return;
            }

        }

        if(e.getSource()==gr0){

            if(gr0.getSelectedIndex()==1){
                b=4.0;
            }else if(gr0.getSelectedIndex()==2){
                b=3.5;
            }else if(gr0.getSelectedIndex()==3){
                b=3.0;
            }else if(gr0.getSelectedIndex()==4){
                b=2.5;
            }else if(gr0.getSelectedIndex()==5){
                b=2.0;
            }else if(gr0.getSelectedIndex()==6){
                b=1.5;
            }else if(gr0.getSelectedIndex()==7){
                b=1.0;
            }else if(gr0.getSelectedIndex()==8){
                b=0.0;
            }else if(gr0.getSelectedIndex()==0){
                return;
            }
        }
        //2
        if(e.getSource()==jc1){

            if(jc1.getSelectedIndex()==1){
                a1=1.0;
            }else if(jc1.getSelectedIndex()==2){
                a1=2.0;
            }else if(jc1.getSelectedIndex()==3){
                a1=3.0;
            }else if(jc1.getSelectedIndex()==4){
                a1=4.0;
            }
        }


        if(gr1.getSelectedIndex()==1){
            b1=4.0;
        }else if(gr1.getSelectedIndex()==2){
            b1=3.5;
        }else if(gr1.getSelectedIndex()==3){
            b1=3.0;
        }else if(gr1.getSelectedIndex()==4){
            b1=2.5;
        }else if(gr1.getSelectedIndex()==5){
            b1=2.0;
        }else if(gr1.getSelectedIndex()==6){
            b1=1.5;
        }else if(gr1.getSelectedIndex()==7){
            b1=1.0;
        }else if(gr1.getSelectedIndex()==8){
            b1=0.0;
        }


        //3
        if(e.getSource()==jc2){

            if(jc2.getSelectedIndex()==1){
                a2=1.0;
            }else if(jc2.getSelectedIndex()==2){
                a2=2.0;
            }else if(jc2.getSelectedIndex()==3){
                a2=3.0;
            }else if(jc2.getSelectedIndex()==4){
                a2=4.0;
            }

        }
        if(gr2.getSelectedIndex()==1){
            b2=4.0;
        }else if(gr2.getSelectedIndex()==2){
            b2=3.5;
        }else if(gr2.getSelectedIndex()==3){
            b2=3.0;
        }else if(gr2.getSelectedIndex()==4){
            b2=2.5;
        }else if(gr2.getSelectedIndex()==5){
            b2=2.0;
        }else if(gr2.getSelectedIndex()==6){
            b2=1.5;
        }else if(gr2.getSelectedIndex()==7){
            b2=1.0;
        }else if(gr2.getSelectedIndex()==8){
            b2=0.0;
        }
        //4
        if(e.getSource()==jc3){

            if(jc3.getSelectedIndex()==1){
                a3=1.0;
            }else if(jc3.getSelectedIndex()==2){
                a3=2.0;
            }else if(jc3.getSelectedIndex()==3){
                a3=3.0;
            }else if(jc3.getSelectedIndex()==4){
                a3=4.0;
            }

        }
        if(gr3.getSelectedIndex()==1){
            b3=4.0;
        }else if(gr3.getSelectedIndex()==2){
            b3=3.5;
        }else if(gr3.getSelectedIndex()==3){
            b3=3.0;
        }else if(gr3.getSelectedIndex()==4){
            b3=2.5;
        }else if(gr3.getSelectedIndex()==5){
            b3=2.0;
        }else if(gr3.getSelectedIndex()==6){
            b3=1.5;
        }else if(gr3.getSelectedIndex()==7){
            b3=1.0;
        }else if(gr3.getSelectedIndex()==8){
            b3=0.0;
        }
        //5
        if(e.getSource()==jc4){

            if(jc4.getSelectedIndex()==1){
                a4=1.0;
            }else if(jc4.getSelectedIndex()==2){
                a4=2.0;
            }else if(jc4.getSelectedIndex()==3){
                a4=3.0;
            }else if(jc4.getSelectedIndex()==4){
                a4=4.0;
            }

        }
        if(gr4.getSelectedIndex()==1){
            b4=4.0;
        }else if(gr4.getSelectedIndex()==2){
            b4=3.5;
        }else if(gr4.getSelectedIndex()==3){
            b4=3.0;
        }else if(gr4.getSelectedIndex()==4){
            b4=2.5;
        }else if(gr4.getSelectedIndex()==5){
            b4=2.0;
        }else if(gr4.getSelectedIndex()==6){
            b4=1.5;
        }else if(gr4.getSelectedIndex()==7){
            b4=1.0;
        }else if(gr4.getSelectedIndex()==8){
            b4=0.0;
        }
        //6
        if(e.getSource()==jc5){

            if(jc5.getSelectedIndex()==1){
                a5=1.0;
            }else if(jc5.getSelectedIndex()==2){
                a5=2.0;
            }else if(jc5.getSelectedIndex()==3){
                a5=3.0;
            }else if(jc5.getSelectedIndex()==4){
                a5=4.0;
            }
        }
        if(gr5.getSelectedIndex()==1){
            b5=4.0;
        }else if(gr5.getSelectedIndex()==2){
            b5=3.5;
        }else if(gr5.getSelectedIndex()==3){
            b5=3.0;
        }else if(gr5.getSelectedIndex()==4){
            b5=2.5;
        }else if(gr5.getSelectedIndex()==5){
            b5=2.0;
        }else if(gr5.getSelectedIndex()==6){
            b5=1.5;
        }else if(gr5.getSelectedIndex()==7){
            b5=1.0;
        }else if(gr5.getSelectedIndex()==8){
            b5=0.0;
        }
        //7
        if(e.getSource()==jc6){

            if(jc6.getSelectedIndex()==1){
                a6=1.0;
            }else if(jc6.getSelectedIndex()==2){
                a6=2.0;
            }else if(jc6.getSelectedIndex()==3){
                a6=3.0;
            }else if(jc6.getSelectedIndex()==4){
                a6=4.0;
            }

        }
        if(gr6.getSelectedIndex()==1){
            b6=4.0;
        }else if(gr6.getSelectedIndex()==2){
            b6=3.5;
        }else if(gr6.getSelectedIndex()==3){
            b6=3.0;
        }else if(gr6.getSelectedIndex()==4){
            b6=2.5;
        }else if(gr6.getSelectedIndex()==5){
            b6=2.0;
        }else if(gr6.getSelectedIndex()==6){
            b6=1.5;
        }else if(gr6.getSelectedIndex()==7){
            b6=1.0;
        }else if(gr6.getSelectedIndex()==8){
            b6=0.0;
        }
        //8
        if(e.getSource()==jc7){

            if(jc7.getSelectedIndex()==1){
                a7=1.0;
            }else if(jc7.getSelectedIndex()==2){
                a7=2.0;
            }else if(jc7.getSelectedIndex()==3){
                a7=3.0;
            }else if(jc7.getSelectedIndex()==4){
                a7=4.0;
            }

        }
        if(gr7.getSelectedIndex()==1){
            b7=4.0;
        }else if(gr7.getSelectedIndex()==2){
            b7=3.5;
        }else if(gr7.getSelectedIndex()==3){
            b7=3.0;
        }else if(gr7.getSelectedIndex()==4){
            b7=2.5;
        }else if(gr7.getSelectedIndex()==5){
            b7=2.0;
        }else if(gr7.getSelectedIndex()==6){
            b7=1.5;
        }else if(gr7.getSelectedIndex()==7){
            b7=1.0;
        }else if(gr7.getSelectedIndex()==8){
            b7=0.0;
        }


        if(e.getSource()==jb2){

            c= a+a1+a2+a3+a4+a5+a6+a7;
            grageans = ((a*b)+(a1*b1)+(a2*b2)+(a3*b3)+(a4*b4)+(a5*b5)+(a6*b6)+(a7*b7))/(a+a1+a2+a3+a4+a5+a6+a7);

            write3.setBounds(400,700,400,200);
            write3.setLayout(null);

            imagel.setIcon(icon);
            imagel.setBounds(200,700,200,200);
            jf.add(imagel);

            imagel.setVisible(true);

            Float ans0 = grageans.floatValue();
            String ans = String.format("%.2f",ans0);
            show.setBounds(50,10,350,100);
            show.setLayout(null);
            show.setFont(new Font("MV boli",Font.PLAIN,35));
            show.setText("you grade is "+ ans );

            String ans2 = String.valueOf(c);
            show2.setBounds(80,50,500,250);
            show2.setLayout(null);
            show2.setFont(new Font("MV boli",Font.PLAIN,20));
            show2.setText("All grade credits is "+ ans2 );


            write3.add(show2);
            write3.add(show);
            jf.add(write3);

            System.out.println("grade :" + ((a*b)+(a1*b1)+(a2*b2)+(a3*b3)+(a4*b4)+(a5*b5)+(a6*b6)+(a7*b7))/(a+a1+a2+a3+a4+a5+a6+a7)  );

            System.out.println("grade credits : "+ c);

        }

        if(settheme.getSelectedIndex()==1){
            jf.getContentPane().setBackground(new Color(28, 28, 28));
            write.setBackground(new Color(51 ,50, 48));
            write2.setBackground(new Color(51 ,50, 48));
            write3.setBackground(new Color(51 ,50, 48));
            jl.setForeground(new Color(255 ,185, 15));
            sub.setForeground(new Color(255 ,185, 15));
            sub0.setForeground(new Color(255 ,185, 15));
            sub1.setForeground(new Color(255 ,185, 15));
            sub2.setForeground(new Color(255 ,185, 15));
            sub3.setForeground(new Color(255 ,185, 15));
            sub4.setForeground(new Color(255 ,185, 15));
            sub5.setForeground(new Color(255 ,185, 15));
            sub6.setForeground(new Color(255 ,185, 15));
            sub7.setForeground(new Color(255 ,185, 15));
            sub0.setBorder(BorderFactory.createLineBorder(Color.white));
            sub1.setBorder(BorderFactory.createLineBorder(Color.white));
            sub2.setBorder(BorderFactory.createLineBorder(Color.white));
            sub3.setBorder(BorderFactory.createLineBorder(Color.white));
            sub4.setBorder(BorderFactory.createLineBorder(Color.white));
            sub5.setBorder(BorderFactory.createLineBorder(Color.white));
            sub6.setBorder(BorderFactory.createLineBorder(Color.white));
            sub7.setBorder(BorderFactory.createLineBorder(Color.white));
            jb.setBackground(new Color(205 ,149, 12));
            jb2.setBackground(new Color(205 ,149, 12));
            show.setForeground(new Color(255 ,185, 15));
            show2.setForeground(new Color(255 ,185, 15));
            jc0.setBackground(new Color(28, 28, 28));
            jc0.setForeground(new Color(255 ,185, 15));
            jc1.setBackground(new Color(28, 28, 28));
            jc1.setForeground(new Color(255 ,185, 15));
            jc2.setBackground(new Color(28, 28, 28));
            jc2.setForeground(new Color(255 ,185, 15));
            jc3.setBackground(new Color(28, 28, 28));
            jc3.setForeground(new Color(255 ,185, 15));
            jc4.setBackground(new Color(28, 28, 28));
            jc4.setForeground(new Color(255 ,185, 15));
            jc5.setBackground(new Color(28, 28, 28));
            jc5.setForeground(new Color(255 ,185, 15));
            jc6.setBackground(new Color(28, 28, 28));
            jc6.setForeground(new Color(255 ,185, 15));
            jc7.setBackground(new Color(28, 28, 28));
            jc7.setForeground(new Color(255 ,185, 15));
            gr0.setBackground(new Color(28, 28, 28));
            gr0.setForeground(new Color(255 ,185, 15));
            gr1.setBackground(new Color(28, 28, 28));
            gr1.setForeground(new Color(255 ,185, 15));
            gr2.setBackground(new Color(28, 28, 28));
            gr2.setForeground(new Color(255 ,185, 15));
            gr3.setBackground(new Color(28, 28, 28));
            gr3.setForeground(new Color(255 ,185, 15));
            gr4.setBackground(new Color(28, 28, 28));
            gr4.setForeground(new Color(255 ,185, 15));
            gr5.setBackground(new Color(28, 28, 28));
            gr5.setForeground(new Color(255 ,185, 15));
            gr6.setBackground(new Color(28, 28, 28));
            gr6.setForeground(new Color(255 ,185, 15));
            gr7.setBackground(new Color(28, 28, 28));
            gr7.setForeground(new Color(255 ,185, 15));
            settheme.setBackground(new Color(28, 28, 28));
            settheme.setForeground(new Color(255 ,185, 15));
            subtutal.setForeground(new Color(255 ,185, 15));
            grade.setForeground(new Color(255 ,185, 15));
            grade1.setForeground(new Color(255 ,185, 15));
            sub.setBorder(BorderFactory.createLineBorder(Color.white));
            grade.setBorder(BorderFactory.createLineBorder(Color.white));
            grade1.setBorder(BorderFactory.createLineBorder(Color.white));
            text0.setForeground(new Color(255 ,185, 15));
            text0.setBackground(new Color(28, 28, 28));
            text1.setForeground(new Color(255 ,185, 15));
            text1.setBackground(new Color(28, 28, 28));
            text2.setForeground(new Color(255 ,185, 15));
            text2.setBackground(new Color(28, 28, 28));
            text3.setForeground(new Color(255 ,185, 15));
            text3.setBackground(new Color(28, 28, 28));
            text4.setForeground(new Color(255 ,185, 15));
            text4.setBackground(new Color(28, 28, 28));
            text5.setForeground(new Color(255 ,185, 15));
            text5.setBackground(new Color(28, 28, 28));
            text6.setForeground(new Color(255 ,185, 15));
            text6.setBackground(new Color(28, 28, 28));
            text7.setForeground(new Color(255 ,185, 15));
            text7.setBackground(new Color(28, 28, 28));


        }else if(settheme.getSelectedIndex()==0){
            jf.getContentPane().setBackground(new Color(255 ,250, 250));
            write.setBackground(new Color(220 ,220 ,220));
            write2.setBackground(new Color(220 ,220 ,220));
            write3.setBackground(new Color(220 ,220 ,220));
            jl.setForeground(new Color(0 ,0, 0));
            sub.setForeground(new Color(0 ,0, 0));
            sub0.setForeground(new Color(0 ,0, 0));
            sub1.setForeground(new Color(0 ,0, 0));
            sub2.setForeground(new Color(0 ,0, 0));
            sub3.setForeground(new Color(0 ,0, 0));
            sub4.setForeground(new Color(0 ,0, 0));
            sub5.setForeground(new Color(0 ,0, 0));
            sub6.setForeground(new Color(0 ,0, 0));
            sub7.setForeground(new Color(0 ,0, 0));
            sub0.setBorder(BorderFactory.createLineBorder(Color.black));
            sub1.setBorder(BorderFactory.createLineBorder(Color.black));
            sub2.setBorder(BorderFactory.createLineBorder(Color.black));
            sub3.setBorder(BorderFactory.createLineBorder(Color.black));
            sub4.setBorder(BorderFactory.createLineBorder(Color.black));
            sub5.setBorder(BorderFactory.createLineBorder(Color.black));
            sub6.setBorder(BorderFactory.createLineBorder(Color.black));
            sub7.setBorder(BorderFactory.createLineBorder(Color.black));
            jb.setBackground(new Color(190 ,190 ,190));
            jb2.setBackground(new Color(190 ,190 ,190));
            show.setForeground(new Color(0 ,0, 0));
            show2.setForeground(new Color(0 ,0, 0));
            jc0.setBackground(new Color(211,211,211));
            jc0.setForeground(new Color(0 ,0, 0));
            jc1.setBackground(new Color(211,211,211));
            jc1.setForeground(new Color(0 ,0, 0));
            jc2.setBackground(new Color(211,211,211));
            jc2.setForeground(new Color(0 ,0, 0));
            jc3.setBackground(new Color(211,211,211));
            jc3.setForeground(new Color(0 ,0, 0));
            jc4.setBackground(new Color(211,211,211));
            jc4.setForeground(new Color(0 ,0, 0));
            jc5.setBackground(new Color(211,211,211));
            jc5.setForeground(new Color(0 ,0, 0));
            jc6.setBackground(new Color(211,211,211));
            jc6.setForeground(new Color(0 ,0, 0));
            jc7.setBackground(new Color(211,211,211));
            jc7.setForeground(new Color(0 ,0, 0));
            gr0.setBackground(new Color(211,211,211));
            gr0.setForeground(new Color(0 ,0, 0));
            gr1.setBackground(new Color(211,211,211));
            gr1.setForeground(new Color(0 ,0, 0));
            gr2.setBackground(new Color(211,211,211));
            gr2.setForeground(new Color(0 ,0, 0));
            gr3.setBackground(new Color(211,211,211));
            gr3.setForeground(new Color(0 ,0, 0));
            gr4.setBackground(new Color(211,211,211));
            gr4.setForeground(new Color(0 ,0, 0));
            gr5.setBackground(new Color(211,211,211));
            gr5.setForeground(new Color(0 ,0, 0));
            gr6.setBackground(new Color(211,211,211));;
            gr6.setForeground(new Color(0 ,0, 0));
            gr7.setBackground(new Color(211,211,211));
            gr7.setForeground(new Color(0 ,0, 0));
            settheme.setBackground(new Color(255 ,250 ,250));
            settheme.setForeground(new Color(0 ,0, 0));
            subtutal.setForeground(new Color(0 ,0, 0));
            grade.setForeground(new Color(0 ,0, 0));
            grade1.setForeground(new Color(0 ,0, 0));
            sub.setBorder(BorderFactory.createLineBorder(Color.black));
            grade.setBorder(BorderFactory.createLineBorder(Color.black));
            grade1.setBorder(BorderFactory.createLineBorder(Color.black));
            text0.setForeground(new Color(0 ,0, 0));
            text0.setBackground(new Color(211,211,211));
            text1.setForeground(new Color(0 ,0, 0));
            text1.setBackground(new Color(211,211,211));;
            text2.setForeground(new Color(0 ,0, 0));
            text2.setBackground(new Color(211,211,211));
            text3.setForeground(new Color(0 ,0, 0));
            text3.setBackground(new Color(211,211,211));;
            text4.setForeground(new Color(0 ,0, 0));
            text4.setBackground(new Color(211,211,211));
            text5.setForeground(new Color(0 ,0, 0));
            text5.setBackground(new Color(211,211,211));
            text6.setForeground(new Color(0 ,0, 0));
            text6.setBackground(new Color(211,211,211));
            text7.setForeground(new Color(0 ,0, 0));
            text7.setBackground(new Color(211,211,211));


        }


    }

}
















