package movedog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class second extends JPanel implements ActionListener, KeyListener{
	Timer t = new Timer(5, this);
	double x = 0, y = 0, velx = 0, vely = 0;
	
	public second(){
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(new Ellipse2D.Double(x, y, 40, 40));
	}
	public void actionPerformed(ActionEvent e){
		if (x < 0 || x > 760){
			velx = -velx;
		}
		if (y < 0 || y > 560){
			vely = -vely;
		}
		repaint();
		x += velx;
		y += vely;
	}
	public void up(){
		vely = -2;
		velx = 0;
	}
	public void down(){
		vely = 2;
		velx = 0;
	}
	public void left(){
		velx = -2;
		vely = 0;
	}
	public void right(){
		velx = 2;
		vely = 0;
	}
	
	public void keyPressed(KeyEvent e){
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_UP){
		up();
	}
		if(code == KeyEvent.VK_DOWN){
			down();
		}
		if(code == KeyEvent.VK_RIGHT){
			right();
		}
		if(code == KeyEvent.VK_LEFT){
			left();
		}
	}
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}










	

}
