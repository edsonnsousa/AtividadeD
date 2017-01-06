package AtividadeD;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Q3 {

	public static void main(String[] args) { //throws FileNotFoundException, UnsupportedEncodingException {
		int[][] img = new int[40][40];
		String valor = "";
		
		for (int i = 0; i < 40; i++ ){
			for (int j = 0; j < 40; j++){
				img[i][j] = new Random().nextInt(256);
				valor += img[i][j] + "\n";
			}
		}
		System.out.println(valor);
		
	}

}