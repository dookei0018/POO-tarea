import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame
{
	private int width = 640;
	private int height = 480;
	private JLabel welcome, total;
	private JTextField talla, descripcion, precio;
	private JButton send;

	public Window(String title)
	{
		super(title);
		setSize(width, height);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);	
	}

	private void init()
	{

	}
	
}