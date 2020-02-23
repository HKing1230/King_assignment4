package King_problem2;

public class SavingsAccountTest {
	public static void main(String[] args) {
		System.out.println("Account1                Account2");
		SavingsAccount saver1,saver2;	
		saver1 = new SavingsAccount ((float)2000.00);
		saver2 = new SavingsAccount ((float)3000.00);
		SavingsAccount.modifyInterestRate((float)0.04);
		
		for(int i=0;i<12;i++) {
		
		System.out.printf("Month %d: %f\t",i+1,saver1.calculateMonthlyInterest());
		System.out.printf("Month %d: %f%n",i+1,saver2.calculateMonthlyInterest());
		}
		
		SavingsAccount.modifyInterestRate((float) 0.05);
		
		System.out.printf("After rate change:%nAccount1:%f%nAccount2:%f",saver1.calculateMonthlyInterest(),
				saver2.calculateMonthlyInterest());
	}
}
