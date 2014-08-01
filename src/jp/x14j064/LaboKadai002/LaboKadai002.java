package jp.x14j064.LaboKadai002;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

import java.util.Scanner;

public class LaboKadai002 extends JFrame implements ActionListener {

	JButton btn1;
	JButton btn2;
	JTextArea ta;

	// ウィンドウ本体
	LaboKadai002() {

		getContentPane().setLayout(new FlowLayout());

		ta = new JTextArea("", 10, 40);
		getContentPane().add(ta);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Kadai");
		setSize(600, 650);

		btn1 = new JButton("保存");// ボタン1
		btn1.setFont(new Font("SansSerif", Font.ITALIC, 20));
		btn1.setBounds(200, 50, 300, 50);
		btn1.addActionListener(this);
		getContentPane().add(btn1);

		btn2 = new JButton("読込");// ボタン2
		btn2.setFont(new Font("SansSerif", Font.ITALIC, 20));
		btn2.setBounds(200, 50, 300, 50);
		btn2.addActionListener(this);
		getContentPane().add(btn2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// System.out.println("ボタンを押した");
		if (e.getSource() == btn1) {
			String s = ta.getText();
			try {
				PrintWriter pw = new PrintWriter("test.txt");
				pw.write(s);
				pw.close();
			} catch (IOException e1) {
				System.out.println(e1);
			}

		}
		if (e.getSource() == btn2) {
			// 読込
			try {
				File file = new File("test.txt");
				Scanner scan = new Scanner(file);
				scan.useDelimiter("\\r\\n");

				String text = "";
				// if (e.getSource() == btn2)
				{
					while (scan.hasNext()) {
						String str = scan.next();
						text = text + str + "\n";

					}
					ta.setText(text);
				}

			} catch (FileNotFoundException event) {
				System.out.println(event);
			}
		}
	}

	public static void main(String[] args) {
		new LaboKadai002();
	}
}
