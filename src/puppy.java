package movedog;
import javax.swing.JFrame;

public class puppy {
	public static void main(String args[]){
		JFrame f = new JFrame();
		second s = new second();
		f.add(s);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
	}


}
