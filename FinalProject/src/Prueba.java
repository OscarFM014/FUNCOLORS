import java.awt.Color;

import javax.swing.*;

public class Prueba {
	public static void main(String[] args) {
		JFrame ventana=new JFrame();
		JButton boton=new JButton();
		boton.setOpaque(true);
		boton.setBorderPainted(false);
		boton.setBackground(Color.RED);
		ventana.add(boton);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(800, 600);
		ventana.setVisible(true);
	}
	

}
