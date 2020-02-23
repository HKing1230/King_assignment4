package King_problem1;

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;

public class CAI1 {
	

	private void quiz() {
		int flag = 1;
		SecureRandom rand = new SecureRandom();
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		int answer = num1 * num2;
		while (flag == 1) {
			askQuestion(num1, num2);
			int response = readResponse();
			int grade = isAnswerCorrect(answer, response);
			if (grade == 1) {
				displayCorrectResponse();
				flag = 0;
			} else {
				displayIncorrectResponse();
			}
		}

	}

	private void askQuestion(int num1, int num2) {
		System.out.printf("How much is %d x %d?", num1, num2);
	}

	private static int readResponse() {
		Scanner sc;
		sc = new Scanner(System.in);
		int response = sc.nextInt();
		return response;
	}

	private static int isAnswerCorrect(int answer, int response) {
		if (answer == response) {
			return 1;
		} else {
			return 0;
		}
	}

	private static void displayCorrectResponse() {
		System.out.println("Very good!");
	}

	private static void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
	}
	
	public static void main(String[] args) {
		CAI1 x;
		x = new CAI1();
		x.quiz();
	}

}
