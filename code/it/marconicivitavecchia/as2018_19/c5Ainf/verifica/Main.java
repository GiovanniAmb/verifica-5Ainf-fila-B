
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(400,600);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder("<html>");
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<h1><b>Speed Test<b></h1>"); //Titolo
		sb.append("<div style='table'>");
		//Riga 1
		sb.append("<divstyle='display:table-row'>");
		
		sb.append("<divstyle='display:table-cell'>");
		sb.append("Date");
		sb.append("Up(Mbps)");
		sb.append("Down(Mbps)");
		sb.append("</div>");
		//Riga 2
		sb.append("<divstyle='display:table-row'>");
				
		sb.append("<divstyle='display:table-cell'>");
		sb.append("1/7/18");
		sb.append("25.0");
		sb.append("28.9");
		sb.append("</div>");
		//Riga 3
		sb.append("<divstyle='display:table-row'>");
				
		sb.append("<divstyle='display:table-cell'>");
		sb.append("7/9/18");
		sb.append("24.6");
		sb.append("1.99");
		sb.append("</div>");
		
		
		// TODO Convertire lo StringBuilder in String
		String stringa= sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
	
		super.add(new JLabel(stringa));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

