

import javax.swing.JFrame;

import test.drawingComponent;

import java.awt.Rectangle;





public class game {
	public static void main(String[]args){
		JFrame window = new JFrame();
		window.setSize(640, 480);
		window.setTitle("Hello");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		drawingComponent DC  = new drawingComponent();
		window.add(DC);
		
	}
	
	
	

}
