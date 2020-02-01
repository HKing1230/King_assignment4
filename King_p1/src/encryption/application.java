package encryption;

import java.util.Scanner;

public class application {
	public static void main(String[] args){
		int choice=0;
		while(1==1) {
			
			System.out.println("What would you like to do?");
			System.out.println("1) Encrypt");
			System.out.println("2) Decrypt");
			System.out.println("3) Exit");
			
			Scanner sc;
			sc= new Scanner(System.in);
			choice = sc.nextInt();
			
			if(choice == 1) {
				encrypter e;
				e = new encrypter();
				e.encrypt();
			}
			else if(choice == 2) {
				decrypter d;
				d = new decrypter();
				d.decrypt();
			}
			else if(choice == 3) {
				System.out.println("Bye!");
				System.exit(0);
			}
			else {
				System.out.println("Invalid Entry%n");
			}
			
		}//end while loop
	
	}
}
