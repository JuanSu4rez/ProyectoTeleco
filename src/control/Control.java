package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ClientFrame;


public class Control implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getActionCommand().toString()) {
		case ClientFrame.MONITOR_DISK:
			monitorDisk();
			break;

		default:
			break;
		}
		
		
	}
	
	private void monitorDisk () {
		System.out.println("MONITOREAR DISCO  ");
	} 

}
