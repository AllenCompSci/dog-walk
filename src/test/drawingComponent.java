package test;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

import java.awt.color.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class drawingComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle rect1 = new Rectangle(5, 5, 100, 200);
		g2.fill(rect1);
		
		Rectangle rect2 = new Rectangle(200, 200, 100, 200);
		g2.fill(rect2);
		
		Rectangle rect3 = new Rectangle(400, 400, 50, 50);
		g2.fill(rect3);
		
		
		Ellipse2D.Double ellipse1 = new Ellipse2D.Double(100, 100, 50, 20);
		g2.fill(ellipse1);
		
		Line2D.Double line1 = new Line2D.Double(150, 150, 100, 50);
		g2.draw(line1);
		
		Point2D.Double p1 = new Point2D.Double(200, 200);
		Point2D.Double p2 = new Point2D.Double(200, 200);
		
		Line2D.Double l2 = new Line2D.Double(p1, p2);
		g2.draw(l2);
	}

}
