package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator extends JFrame 
{

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_9;
	private JButton button_8;
	private JButton button_10;
	private JButton button_11;
	private JButton button_1;
	private JButton button_14;
	private JButton button_12;
	private JButton button_4;
	private JButton button_3;
	private JButton button_2;
	private JButton button_13;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JList list;
	
	DefaultListModel DLM = new DefaultListModel<String>();

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
		list.setToolTipText("");
		list.setModel(DLM);
		
		
		btnNewButton = new JButton("1");
		
		button = new JButton("2");
		
		button_1 = new JButton("3");
		
		button_2 = new JButton("4");
		
		button_3 = new JButton("5");
		
		button_4 = new JButton("6");
		
		button_5 = new JButton("9");
		
		button_6 = new JButton("8");
		
		button_7 = new JButton("7");
		
		button_8 = new JButton("0");
		
		button_9 = new JButton(",");
		
		button_10 = new JButton("+");
		
		button_11 = new JButton("-");
		
		button_12 = new JButton("*");
		
		button_13 = new JButton("/");
		
		button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnNewButton)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
										.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(button_10))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_7)
								.addComponent(button_6)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(button_5)
									.addComponent(button_13)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_2)
								.addComponent(button_3)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(button_4)
									.addComponent(button_12)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(button)
								.addComponent(button_1)
								.addComponent(button_11))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_8)
								.addComponent(button_9)
								.addComponent(button_10))
							.addGap(15))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(19))))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
////////////////////////////////////////////////////////////////////////////
////DEKLAROWANIE I TWORZENIE EVENTÓW 
////////////////////////////////////////////////////////////////////////////
	private void createEvents() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DLM.addElement(1);
			}
		});
		
	}
}
