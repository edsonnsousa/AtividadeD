package AtividadeD;
import java.util.Random;

import javax.swing.JOptionPane;

public class Q4 {

	public static void main(String[] args) {
		int[] par = new int[10];
		int[] impar = new int[10];
		
		String Numpares = " ", Numimpares = " ";
		
		for (int i = 0; i < 10; i++) {
			int valor = new Random().nextInt(20) + 1;
			if (valor % 2 == 0) {
				par[i] = valor;
				Numpares += par[i] + " - ";
			} else {
				impar[i] = valor;
				Numimpares += impar[i] + " - ";
			}
		}
		
		JOptionPane.showMessageDialog(null, "Pares:\n" + Numpares + "\nImpares:\n" + Numimpares);
		
		 

	}

}