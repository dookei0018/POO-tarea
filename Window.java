import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame
{
	private int width = 640;
	private int height = 480;
	private int artNoRegistrados = 5;
	private CarritoDeCompras carrito;
	private JLabel welcome, tallaL, descripcionL, precioL, total;
	private JTextField tallaTF, descripcionTF, precioTF;
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
		carrito = new CarritoDeCompras();
		welcome = new JLabel("Bienvenido, por favor registra 5 productos");
		total = new JLabel();
		tallaL= new JLabel("Talla: ");
		tallaTF = new JTextField(10);
		descripcionL = new JLabel("Descripcion: ");
		descripcionTF = new JTextField(20);
		precioL = new JLabel("Precio: ");
		precioTF = new JTextField(10);
		send = new JButton("Registrar");
		send.setActionCommand("R");
		send.addActionListener(new MyListener());
		add(welcome);
		add(tallaL);
		add(tallaTF);
		add(descripcionL);
		add(descripcionTF);
		add(precioL);
		add(precioTF);
		add(send);
		add(total);	
	}

	private class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (!tallaTF.getText().equals("") && !descripcionTF.getText().equals("") && !precioTF.getText().equals(""))
			{
				artNoRegistrados--;
				carrito.agregar(new Ropa(tallaTF.getText(), 
							descripcionTF.getText(),
							Double.parseDouble(precioTF.getText())));
				tallaTF.setText("");
				descripcionTF.setText("");
				precioTF.setText("");
				welcome.setText("Registra " + artNoRegistrados + " articulo(s)");
			}
			else
			{
				welcome.setText("Faltan datos!!");
			}
			if(artNoRegistrados == 0)
			{
				remove(welcome);
				remove(tallaL);
				remove(tallaTF);
				remove(descripcionL);
				remove(descripcionTF);
				remove(precioL);
				remove(precioTF);
				remove(send);
				total.setText("Precio total: $" + carrito.finalizar());
			}
		}	
	}
	
}