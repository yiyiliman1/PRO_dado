package cara_cruz;

import java.util.Random;

public class Dado6 {

	public static void main(String[] args) {
		//dado de 6 caras
		Random randGen = new Random();
		
		int dado = randGen.nextInt(7);
		 
		System.out.println(dado);

	}

}
