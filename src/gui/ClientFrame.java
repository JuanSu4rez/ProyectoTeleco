package gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ClientFrame extends JFrame {
	
	private final int WIDTH = 600;
	private final int HEIGHT = 400;
	private final String TITLE = "Proyecto telecomunicaciones";

	public ClientFrame() {
		
		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		this.setTitle(TITLE);
		this.setResizable(false);
		
		this.setVisible(true);
		
		
	}
	
}
