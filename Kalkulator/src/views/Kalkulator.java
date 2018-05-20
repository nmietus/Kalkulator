package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.ButtonEvents;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class Kalkulator extends JFrame 
{

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	private JButton btnComa;
	private JButton btn0;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btn3;
	private JButton btnEqual;
	private JButton btnMulti;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btnDiv;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JList list;
	
	DefaultListModel DLM = new DefaultListModel<String>();
	int indexNumber = 0;
	String kontrolny = "";
	private JLabel lblKontrolna;

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
					Kalkulator frame = new Kalkulator();
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
	public Kalkulator() 
	{
		
		initComponents();
		createEvents();
		
		
	}

	

	
	
////////////////////////////////////////////////////////////////////////////
////DEKLAROWANIE I INICJOWANIE KOMPONENTÓW
////////////////////////////////////////////////////////////////////////////
	private void initComponents() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		list = new JList();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setToolTipText("");
		list.setModel(DLM);
		
		
		btn1 = new JButton("1");
		
		btn2 = new JButton("2");
		btn2.setMargin(new Insets(0, 0, 0, 0));
		
		btn3 = new JButton("3");
		btn3.setMargin(new Insets(0, 0, 0, 0));
		
		btn4 = new JButton("4");
		btn4.setMargin(new Insets(0, 0, 0, 0));
		
		btn5 = new JButton("5");
		btn5.setMargin(new Insets(0, 0, 0, 0));
		
		btn6 = new JButton("6");
		btn6.setMargin(new Insets(0, 0, 0, 0));
		
		btn9 = new JButton("9");
		btn9.setMargin(new Insets(0, 0, 0, 0));
		
		btn8 = new JButton("8");
		btn8.setMargin(new Insets(0, 0, 0, 0));
		
		btn7 = new JButton("7");
		btn7.setMargin(new Insets(0, 0, 0, 0));
		
		btn0 = new JButton("0");
		
		btnComa = new JButton(",");
		
		btnPlus = new JButton("+");
		btnPlus.setMargin(new Insets(0, 0, 0, 0));
		
		btnMinus = new JButton("-");
		
		btnMulti = new JButton("*");
		
		btnDiv = new JButton("/");
		
		btnEqual = new JButton("=");
		
		
		lblKontrolna = new JLabel("kontrolna");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnDiv, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnMulti, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
										.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnComa, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnPlus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))))
							.addGap(12)
							.addComponent(btnEqual, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
							.addComponent(lblKontrolna)
							.addGap(28))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnDiv, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(btn7, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(btn8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnMulti, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn4, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addComponent(btn5, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btn3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnMinus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn0)
								.addComponent(btnComa)
								.addComponent(btnPlus, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGap(15))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblKontrolna)
								.addComponent(btnEqual, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
							.addGap(19))))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
////////////////////////////////////////////////////////////////////////////
////DEKLAROWANIE I TWORZENIE EVENTÓW 
////////////////////////////////////////////////////////////////////////////
	private void createEvents() {	
		
		ButtonEvents.wykonajAkcje(btn1, "1", DLM, indexNumber); //1
		ButtonEvents.wykonajAkcje(btn2, "2", DLM, indexNumber); //2
		ButtonEvents.wykonajAkcje(btn3, "3", DLM, indexNumber); //3
		ButtonEvents.wykonajAkcje(btn4, "4", DLM, indexNumber); //4
		ButtonEvents.wykonajAkcje(btn5, "5", DLM, indexNumber); //5
		ButtonEvents.wykonajAkcje(btn6, "6", DLM, indexNumber); //6
		ButtonEvents.wykonajAkcje(btn7, "7", DLM, indexNumber); //7
		ButtonEvents.wykonajAkcje(btn8, "8", DLM, indexNumber); //8
		ButtonEvents.wykonajAkcje(btn9, "9", DLM, indexNumber); //9
		ButtonEvents.wykonajAkcje(btn0, "0", DLM, indexNumber); //0
		
		btnEqual.addActionListener(new ActionListener() {	//=
			public void actionPerformed(ActionEvent arg0) {
				DLM.add(indexNumber, DLM.getElementAt(indexNumber)+"="+"wynik");
				indexNumber++;
			}
		});
	}
}
