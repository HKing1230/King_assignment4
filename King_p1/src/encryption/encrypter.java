package encryption;

import java.util.Scanner;

public class encrypter {
	public void encrypt() {
		int output,input,num1,num2,num3,num4,temp;
		System.out.printf("Provide the four-digit number that you want encrypted: ");
		Scanner sc;
		sc= new Scanner(System.in);
		input = sc.nextInt();
		
		num1=(input/1000+7)%10;
		num2 = (input/100+7)%10;
		num3 = (input/10+7)%10;
		num4 = (input+7)%10;
		
		temp  = num1;
		num1 = num3;
		num3 = temp;
		
		temp = num2;
		num2 = num4;
		num4 = temp;
		
		System.out.printf("Encrypted Number:%d%d%d%d%n%n",num1,num2,num3,num4);
		
	}

}
