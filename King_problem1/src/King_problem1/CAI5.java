package King_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {
	private void quiz() {
		int difficulty = readDifficulty();
		int problemType = readProblemType();
		double count = 0;
		for(int i = 0;i<10;i++) {
		int type = 0;
		int num1 = generateQuestionArgument(difficulty);
		int num2 = generateQuestionArgument(difficulty);
		if(problemType >= 1 && problemType <= 4) {
			type = problemType;
		}
		if(problemType == 5) {
			SecureRandom rand = new SecureRandom();
			type = 1 + rand.nextInt(4);
		}
		if(type == 4 && num2 == 0) {
			num2++;
		}
		int answer = 0;
		if(type == 1) {
			answer = num1 + num2;
		}
		if(type == 2) {
			answer = num1 * num2;
		}
		if(type == 3) {
			answer = num1 - num2;
		}
		if(type == 4) {
			answer = num1 / num2;
		}
			askQuestion(num1, num2, type);
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

	private void askQuestion(int num1, int num2,int problemType) {
		if(problemType == 1) {
			System.out.printf("How much is %d + %d?", num1, num2);
		}
		if(problemType == 2) {
			System.out.printf("How much is %d x %d?", num1, num2);
		}
		if(problemType == 3) {
			System.out.printf("How much is %d - %d?", num1, num2);
		}
		if(problemType == 4) {
			System.out.printf("How much is %d / %d?", num1, num2);
		}
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
	
	private static int readDifficulty() {
		System.out.printf("Select your difficulty 1-4: ");
		Scanner sc;
		sc = new Scanner(System.in);
		int difficulty = sc.nextInt();
		return difficulty;
	}
	
	private static int generateQuestionArgument(int difficulty) {
		SecureRandom rand = new SecureRandom();
		int argument = 0;
		if(difficulty == 1) {
			argument = rand.nextInt(10);
		}
		if(difficulty == 2) {
			argument = rand.nextInt(100);
		}
		if(difficulty == 3) {
			argument = rand.nextInt(1000);
		}
		if(difficulty == 4) {
			argument = rand.nextInt(10000);
		}
		
		
		return argument;
	}
	private static int readProblemType(){
		System.out.printf("Select your problem type:%n"
				+ "1)Addition%n"
				+ "2)Multiplication%n"
				+ "3)Subtraction%n"
				+ "4)Division%n"
				+ "5)Random mixture of all types");
		int problemType = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		problemType = sc.nextInt();
		return problemType;
	}
	
	public static void main(String[] args) {
		CAI5 x;
		x = new CAI5();
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
