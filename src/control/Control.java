package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.ClientFrame;
import net.NetClient;


public class Control implements ActionListener {
	
	private NetClient netClient;
	static boolean monitoring;
	Thread thread;

	public Control() {
		// TODO Auto-generated constructor stub
		netClient = new NetClient();		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getActionCommand().toString()) {
		case ClientFrame.START:
			start();
			break;
		case ClientFrame.STOP:
			stop();
			break;
		default:
			break;
		}
	}
	
	private void start() {		
		
		Runnable runnable = () -> initMonitoringTask();
		thread = new Thread(runnable);
		thread.start();
		monitoring = true;
	} 
	
	private void initMonitoringTask() {
		while (monitoring) {
			netClient.getServerData();
			try {
				thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
	private void stop() {		
		monitoring = false;
	} 

}
