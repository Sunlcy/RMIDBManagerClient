package cc.chaoyangliu.rmiprac.service;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Launch the application.
 */
public class Client {
	static ReturnValues value = new ReturnValues();
	static String dbn;
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login lg = new Login();
		try {
			lg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			lg.setModal(true);
			value = lg.showDialog();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		dbn = JOptionPane.showInputDialog("Please Input the Name of your DataBase in MySql:");
		if (value.btnValue) {
			GradeManager frame = new GradeManager();
			frame.setVisible(true);					
			frame.setDs(value.usr, value.pwd, dbn);
		}
		
	}

}
