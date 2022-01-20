package application;

import java.security.SecureRandom;

public class Program {

	public static void main(String[] args) {

		SecureRandom rn = new SecureRandom();

		int frenquency1 = 0;
		int frenquency2 = 0;
		int frenquency3 = 0;
		int frenquency4 = 0;
		int frenquency5 = 0;
		int frenquency6 = 0;

		for (int i = 1; i < 6000000; i++) {
			int face = 1 + rn.nextInt(6);

			switch (face) {
			case 1:
				++frenquency1;
				break;
			case 2:
				++frenquency2;
				break;
			case 3:
				++frenquency3;
				break;
			case 4:
				++frenquency4;
				break;
			case 5:
				++frenquency5;
				break;
			case 6:
				++frenquency6;
				break;
			}
		}
		
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frenquency1, 
				frenquency2, frenquency3, frenquency4, frenquency5, frenquency6);

	}

}
