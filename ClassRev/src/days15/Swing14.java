package days15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calendars extends JFrame{
	
	JTextField [] jt = new JTextField[42];
	
	Calendars(){
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jp1.setLayout(new GridLayout(1,7)); //�� �� ȭ �� �� �� �� ������ ������ ǥ�õ� �κ�
		jp2.setLayout(new GridLayout(6,7)); //�޷��� ǥ�õ� �κ�
		jp3.setLayout(new FlowLayout()); //���� �޷��� �� ���� ǥ�õ� �κ�
		
		Font f = new Font("����", Font.BOLD,20);
		JButton b1 = new JButton("��");
		b1.setFont(f);
		JButton b2 = new JButton("��");
		b2.setFont(f);
		JButton b3 = new JButton("ȭ");
		b3.setFont(f);
		JButton b4 = new JButton("��");
		b4.setFont(f);
		JButton b5 = new JButton("��");
		b5.setFont(f);
		JButton b6 = new JButton("��");
		b6.setFont(f);
		JButton b7 = new JButton("��");
		b7.setFont(f);
		
		jp1.add(b1).setForeground(Color.RED);
		jp1.add(b2);
		jp1.add(b3);
		jp1.add(b4);
		jp1.add(b5);
		jp1.add(b6).setForeground(Color.BLUE);
		
		con.add(jp1, BorderLayout.NORTH);
		
		JButton bb1 = new JButton("���� ��");
		JButton bb2 = new JButton("���� ��");
		JTextField y= new JTextField(5);
		JTextField m= new JTextField(3);
		JLabel sy =new JLabel("��");
		JLabel sm=new JLabel("��");
		
		jp3.add(bb1); jp3.add(y); jp3.add(sy); jp3.add(m); jp3.add(sm); jp3.add(bb2);
		con.add(jp3, BorderLayout.SOUTH);
		
		
		
		
		
		setTitle("Swing Calendar");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Swing14 {

	public static void main(String[] args) {
		new Calendars();
	}

}