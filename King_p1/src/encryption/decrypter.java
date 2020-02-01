package encryption;

import java.util.Scanner;

public class decrypter {
	public void decrypt() {
		int output,input,num1,num2,num3,num4,temp;
		
		System.out.printf("Provide the four-digit number that you want decrypted: ");
		Scanner sc;
		sc= new Scanner(System.in);
		input = sc.nextInt();
		
		num1 = (input/1000+3)%10;
		num2 = (input/100+3)%10;
		num3 = (input/10+3)%10;
		num4 = (input+3)%10;
		
		temp  = num1;
		num1 = num3;
		num3 = temp;
		
		temp = num2;
		num2 = num4;
		num4 = temp;
		
		System.out.printf("Decrypted Number:%d%d%d%d%n%n",num1,num2,num3,num4);
		
	}
}
