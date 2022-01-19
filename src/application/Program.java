package application;

import java.security.SecureRandom;

public class Program {

	public static void main(String[] args) {
		
		// Lançamento de dados.

		SecureRandom sr = new SecureRandom();

		for (int i = 1; i <= 20; i++) {
			int randomValue = 1 + sr.nextInt(6);
			System.out.printf("%d ", randomValue);
			if (i % 5 == 0) {
				System.out.println();
			}
		}

	}

}
