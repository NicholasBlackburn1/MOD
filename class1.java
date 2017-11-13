
	import java.io.IOException;
	import javax.swing.*;

	public class class1 {
		public static void main(String[]  args) throws IOException {
			new ImageIcon("1.jpg");
	    JLabel label = new JLabel(new ImageIcon("1.jpg"));
	    JFrame f = new JFrame();
	    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    f.getContentPane().add(label);
	    f.pack();
	    f.setLocation(200,200);
	    f.setVisible(true);
	    System.out.print("Class1 loaded");
	  }
	    {
             
	    }}


