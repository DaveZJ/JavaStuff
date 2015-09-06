import javax.swing.JFrame;
import java.awt.Dimension;

public class Program
{
	public static void main(String[] args) 
	{
		JFrame appFrame = new RectangleFrame();
		appFrame.setSize(new Dimension(320,300));
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.show();
	}
}
