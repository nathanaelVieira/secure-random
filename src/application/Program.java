package application;

import java.security.SecureRandom;

public class Program {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum Status {
		CONTINUE, WON, LOST
	}

	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {

		int myPoint = 0;
		Status gameStatus;

		int sumOfDice = rollDice();

		switch (sumOfDice) {

		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}

		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			if (sumOfDice == myPoint)
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN)
				gameStatus = Status.LOST;
		}
		
		if ( gameStatus == Status.WON)
			System.out.println("Player wins");
		else
			System.out.println("Player loses");
	}

	public static int rollDice() {
		int diel1 = 1 + randomNumbers.nextInt(6);
		int diel2 = 1 + randomNumbers.nextInt(6);

		System.out.printf("Player rolled %d + %d = %d%n", diel1, diel2, (diel1 + diel2));

		return diel1 + diel2;
	}
}
