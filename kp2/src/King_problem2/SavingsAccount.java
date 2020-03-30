package King_problem2;

public class SavingsAccount {


private static float annualInterestRate;
private float savingsBalance;

public SavingsAccount(float original_balance) {
	savingsBalance = original_balance;
}

public float calculateMonthlyInterest() {
	
	float monthly_interest;
	monthly_interest = this.savingsBalance * (annualInterestRate/12);
	this.savingsBalance += monthly_interest;
	return this.savingsBalance;
	
}

public static void modifyInterestRate(float new_value) {
	annualInterestRate = new_value;
}
	


}
