package King_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {
	private void quiz() {
		double count = 0;
		for(int i = 0;i<10;i++) {
		SecureRandom rand = new SecureRandom();
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		int answer = num1 * num2;
			askQuestion(num1, num2);
			int response = readResponse();
			int grade = isAnswerCorrect(answer, response);
			if (grade == 1) {
				displayCorrectResponse();
				count++;
			} 
			else {
				displayIncorrectResponse();
			}
		}
		displayCompletionMessage(count);

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
		SecureRandom rand = new SecureRandom();
		int randomPositiveResponse = 1 + rand.nextInt(4);
		switch(randomPositiveResponse) {
		case 1:
			System.out.println("Very Good!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice Work!");
			break;
		case 4:
			System.out.println("Keep up the good work!");
			break;
		default:
			break;
		}
	}

	private static void displayIncorrectResponse() {
		SecureRandom rand = new SecureRandom();
		int randomPositiveResponse = 1 + rand.nextInt(4);
		switch(randomPositiveResponse) {
		case 1:
			System.out.println("No. Please try again.");
			break;
		case 2:
			System.out.println("Wrong. Try once more.");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4:
			System.out.println("No. Keep trying.");
			break;
		default:
			break;
		}
	}
	
	private void displayCompletionMessage(double count) {
		double score = (count / 10) * 100;
		System.out.printf("Score: %d%%%n",(int)score);
		if(score < 75) {
			System.out.println("Please ask your teacher for extra help.");
		}
		if(score >=75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
	}
	
	public static void main(String[] args) {
		CAI3 x;
		x = new CAI3();
		x.quiz();
		System.out.printf("Would you like to solve another problem set?%n1)Yes%n2)No%n");
		Scanner sc;
		sc = new Scanner(System.in);
		int newProblemSet = sc.nextInt();
		while(newProblemSet == 1) {
			x.quiz();
			System.out.printf("Would you like to solve another problem set?%n1)Yes%n2)No%n");
			newProblemSet = sc.nextInt();
		}
		
	}
}
