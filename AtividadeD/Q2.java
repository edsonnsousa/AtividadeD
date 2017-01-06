package AtividadeD;

import java.util.Random;

import javax.swing.JOptionPane;

public class Q2 {

	public static void main(String[] args) {
		String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", 
				"Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro"};
		
		int valor = new Random().nextInt(11);
		
		JOptionPane.showMessageDialog(null, meses[valor]);
		
		

	}

}