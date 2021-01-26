package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ClientFrame;
import net.NetClient;


public class Control implements ActionListener {
	
	private NetClient netClient;

	public Control() {
		// TODO Auto-generated constructor stub
		netClient = new NetClient();		
	}
	
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
		netClient.sendMessageMonitorDisk();
	} 

}
