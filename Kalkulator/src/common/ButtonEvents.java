package common;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class ButtonEvents {

	public static void wykonajAkcje(JButton JBttn, String str, DefaultListModel DLM, int indexNumber) {
		
		JBttn.addActionListener(new ActionListener() {		// dodaje str do listy
			public void actionPerformed(ActionEvent e) {
				
				if(DLM.size()==0) DLM.addElement(str);
				else DLM.set(indexNumber, DLM.getElementAt(0)+str);
			}
		});
	}
}
