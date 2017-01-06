package AtividadeD;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args) {
		double[] notas = new double[5];
		String NotasGerais = " ";
		double media = 0;
		
		for (int i = 0; i < 5; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota: "));
		}
		
		Arrays.sort(notas);
		
		for (int i = 4; i >= 0; i--){
			NotasGerais += notas[i] + "\n";
			media += notas[i];
		}
		
		media = media / 5.0;
		
		JOptionPane.showMessageDialog(null,"MEDIA:\n" + media);
	}

}