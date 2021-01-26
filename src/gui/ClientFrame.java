package gui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import control.Control;

public class ClientFrame extends JFrame {
	
	public final static String MONITOR_DISK = "Disco";
	public final static String MONITOR_MEMORY_JVM = "Memoria JVM";
	
	private final int WIDTH = 600;
	private final int HEIGHT = 400;
	private final String TITLE = "Proyecto telecomunicaciones";
	
	//pnlDiskUsage
	private JPanel pnlDiskUsage;
	
	private JButton btnDiskUsage;
	private JLabel lblFreeSpace;
	private JLabel lblFreeSpaceValue;
	private JLabel lblTotalSpace;
	private JLabel lblTotalSpaceValue;
	
	//end pnlDiskUsage
	
	private JButton btnRamUsage;
	

	public ClientFrame( Control controlador) {
		
		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		this.setTitle(TITLE);
		this.setResizable(false);
		this.setLayout(null);
		
		
		pnlDiskUsage: {
			
			TitledBorder title;
			title = BorderFactory.createTitledBorder(MONITOR_DISK);
					
			this.pnlDiskUsage = new JPanel();		
			this.pnlDiskUsage.setBorder(title);
			this.pnlDiskUsage.setBounds(10, 10, 400, 300);
			this.pnlDiskUsage.setLayout(null);						
			 		
			lblTotalSpace = new JLabel("Espacio total: ");
			lblTotalSpace.setBounds(10, 10, 100, 50);
			this.pnlDiskUsage.add(lblTotalSpace);
			
			lblFreeSpaceValue = new JLabel("");
			lblFreeSpaceValue.setBounds(90, 10, 100, 50);
			this.pnlDiskUsage.add(lblFreeSpaceValue);
			
			lblFreeSpace = new JLabel("Espacio libre: ");
			lblFreeSpace.setBounds(10, 50, 100, 50);
			this.pnlDiskUsage.add(lblFreeSpace);
			
			lblTotalSpaceValue = new JLabel("");
			lblTotalSpaceValue.setBounds(90, 50, 100, 50);
			this.pnlDiskUsage.add(lblTotalSpaceValue);
			
			btnDiskUsage = new JButton(MONITOR_DISK);
			btnDiskUsage.setBounds(220, 100, 100, 30);
			btnDiskUsage.addActionListener(controlador);
			this.pnlDiskUsage.add(btnDiskUsage);
			
			btnRamUsage = new JButton(MONITOR_MEMORY_JVM);
			btnRamUsage.setBounds(220, 200, 100, 30);
			btnRamUsage.addActionListener(controlador);
			this.pnlDiskUsage.add(btnRamUsage);
		}
		
		
		
		
		this.add(pnlDiskUsage);
		
		
		
		/*
		 * File cDrive = new File("C:");
System.out.println(String.format("Total space: %.2f GB",
  (double)cDrive.getTotalSpace() /1073741824));
System.out.println(String.format("Free space: %.2f GB", 
  (double)cDrive.getFreeSpace() /1073741824));
System.out.println(String.format("Usable space: %.2f GB", 
  (double)cDrive.getUsableSpace() /1073741824));
		 */
		
		
		//this.setVisible(true);
		
		
	}
	
	private void refreshDiskData(String totalSpace, String freeSpace) {
		lblTotalSpaceValue.setText(totalSpace);
		lblFreeSpaceValue.setText(freeSpace);
	}
	
}
