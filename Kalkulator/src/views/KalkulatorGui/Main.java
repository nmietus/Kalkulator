package views.KalkulatorGui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
//import java.awt.GridBagLayout;

public class Main extends JFrame 
{
	DefaultListModel DLM;
	private double[] tablica;
	private double[] tablicaDzialan;
	int indeks = 0;
	int indeksDzialan = 0;
	
	/**
	 * 0 - powtórz liczbe (brak dzia³añ)
	 * 1 - dodawanie
	 * 2 - odejmowanie
	 * 3 - mno¿enie
	 * 4 - dzielenie
	 * 
	 */
	
	//for(int i=0; i<10; i++) {
	//	
	//}
	
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	
	private JButton btnComa;
	private JButton btnEqual;
	private JButton btnPlus;
	private JList list;
	private JScrollPane scrollPane;
	private JLabel lblTestIndeks;
	private JLabel lblTestLista;
	private JButton bntMinus;
	private JButton btnMulti;
	private JButton btnDev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() 
	{
		
		initComponents();
		initEvents();
	}

/////////////////////////////////////
//TWORZENIE I INICJOWANIE KOMPONENTÓW
/////////////////////////////////////
	void initComponents() 
	{
		DLM = new DefaultListModel<String>();
		tablica = new double[100];
		for(int i=0; i<100; i++) {
			tablica[i] = 0;
		}
		
		tablicaDzialan = new double[10];
		for(int i=0; i<10; i++) {
			tablicaDzialan[i] = 0;
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btn1 = new JButton("1");
		btn1.setMargin(new Insets(0, 0, 0, 0));
		btn1.setBounds(100, 190, 35, 30);
		
		btn2 = new JButton("2");
		btn2.setMargin(new Insets(0, 0, 0, 0));
		btn2.setBounds(140, 190, 35, 30);
		
		btn3 = new JButton("3");
		btn3.setMargin(new Insets(0, 0, 0, 0));
		btn3.setBounds(180, 190, 35, 30);
		
		btn4 = new JButton("4");
		btn4.setMargin(new Insets(0, 0, 0, 0));
		btn4.setBounds(100, 155, 35, 30);
		
		btn5 = new JButton("5");
		btn5.setMargin(new Insets(0, 0, 0, 0));
		btn5.setBounds(140, 155, 35, 30);
		
		btn6 = new JButton("6");
		btn6.setMargin(new Insets(0, 0, 0, 0));
		btn6.setBounds(180, 155, 35, 30);
		
		btn7 = new JButton("7");
		btn7.setMargin(new Insets(0, 0, 0, 0));
		btn7.setBounds(100, 120, 35, 30);
		
		btn8 = new JButton("8");
		btn8.setMargin(new Insets(0, 0, 0, 0));
		btn8.setBounds(140, 120, 35, 30);
		
		btn9 = new JButton("9");
		btn9.setMargin(new Insets(0, 0, 0, 0));
		btn9.setBounds(180, 120, 35, 30);
		
		btn0 = new JButton("0");
		btn0.setMargin(new Insets(0, 0, 0, 0));
		btn0.setBounds(100, 221, 75, 30);
		
		btnEqual = new JButton("=");
		btnEqual.setBounds(270, 155, 35, 68);
		btnEqual.setMargin(new Insets(0, 0, 0, 0));
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(99, 11, 228, 68);
		getContentPane().add(scrollPane);
		
		list = new JList();
		list.setModel(DLM);
//		list.setModel(new AbstractListModel() {
//			String[] values = new String[] {"0"};
//			public int getSize() {
//				return values.length;
//			}
//			public Object getElementAt(int index) {
//				return values[index];
//			}
//		});
		scrollPane.setViewportView(list);
		getContentPane().add(btn7);
		getContentPane().add(btn8);
		getContentPane().add(btn9);
		getContentPane().add(btn0);
		getContentPane().add(btn4);
		getContentPane().add(btn5);
		getContentPane().add(btn6);
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		getContentPane().add(btn3);
		getContentPane().add(btnEqual);
		
		btnComa = new JButton(",");
		btnComa.setMargin(new Insets(0, 0, 0, 0));
		btnComa.setBounds(180, 221, 35, 30);
		getContentPane().add(btnComa);
		
		btnPlus = new JButton("+");
		btnPlus.setMargin(new Insets(0, 0, 0, 0));
		btnPlus.setBounds(225, 221, 35, 30);
		getContentPane().add(btnPlus);
		
		lblTestIndeks = new JLabel("test");
		lblTestIndeks.setBounds(360, 171, 46, 14);
		getContentPane().add(lblTestIndeks);
		
		lblTestLista = new JLabel("test");
		lblTestLista.setBounds(360, 198, 46, 14);
		getContentPane().add(lblTestLista);
		
		bntMinus = new JButton("-");
		bntMinus.setMargin(new Insets(0, 0, 0, 0));
		bntMinus.setBounds(225, 190, 35, 30);
		getContentPane().add(bntMinus);
		
		btnMulti = new JButton("*");
		btnMulti.setMargin(new Insets(0, 0, 0, 0));
		btnMulti.setBounds(225, 155, 35, 30);
		getContentPane().add(btnMulti);
		
		btnDev = new JButton("/");
		btnDev.setMargin(new Insets(0, 0, 0, 0));
		btnDev.setBounds(225, 120, 35, 30);
		getContentPane().add(btnDev);
	}
/////////////////////////////////////
//TWORZENIE I INICJOWANIE KOMPONENTÓW
/////////////////////////////////////
	void initEvents() 
	{
		
		btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tablica[indeks]=tablica[indeks]*10+0;
					
					if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
					else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
					list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
				}
			});
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+1;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+2;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+3;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+4;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+5;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+6;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+7;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+8;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablica[indeks]=tablica[indeks]*10+9;
				
				if(DLM.size()<=indeks) DLM.addElement(String.format("%.0f", tablica[indeks]));
				else DLM.set(indeks, String.format("%.0f", tablica[indeks]));
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indeks++;
				indeksDzialan = 1;
				//DLM.addElement(tablica[indeks]);
				lblTestIndeks.setText(indeks+"");
				lblTestLista.setText(DLM.getSize()+"");
			}
		});
		
		bntMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indeks++;
				indeksDzialan = 2;
				//DLM.addElement(tablica[indeks]);
				lblTestIndeks.setText(indeks+"");
				lblTestLista.setText(DLM.getSize()+"");
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indeks++;
				indeksDzialan = 3;
				//DLM.addElement(tablica[indeks]);
				lblTestIndeks.setText(indeks+"");
				lblTestLista.setText(DLM.getSize()+"");
			}
		});

		btnDev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indeks++;
				indeksDzialan = 4;
				//DLM.addElement(tablica[indeks]);
				lblTestIndeks.setText(indeks+"");
				lblTestLista.setText(DLM.getSize()+"");
			}
		});
		
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(indeksDzialan) {						//operacje na liczbach
					case 0:									//powtórzenie ostatniej liczby
						indeks++;
						DLM.addElement(String.format("%.0f", tablica[indeks-1]));
						break;
					case 1:									//dodawanie
						indeks++;
						tablica[indeks] = tablica[indeks-1]+tablica[indeks-2];
						DLM.addElement(String.format("%.0f", tablica[indeks]));
						break;
					case 2:									//odejmowanie
						indeks++;
						tablica[indeks] = -tablica[indeks-1]+tablica[indeks-2];
						DLM.addElement(tablica[indeks]);
						break;
					case 3:									//mno¿enie
						indeks++;
						tablica[indeks] = tablica[indeks-1]*tablica[indeks-2];
						DLM.addElement(String.format("%.0f", tablica[indeks]));
						break;
					case 4:									//dzielenie
						indeks++;
						tablica[indeks] = tablica[indeks-2]/tablica[indeks-1];
						DLM.addElement(String.format("%.0f", tablica[indeks]));
						break;
				}
				list.ensureIndexIsVisible(indeks);	//widocznoœæ ostatniego indeksu
			}
		});
		
	}
}