package bmi_package;

import java.util.Scanner;

public class BMICalculator {
	private float height;
	private float weight;
	private String units;
	private float BMI;
	private int BMICategory;
	private int type;
	private void readImperialData() {
		System.out.printf("Provide your weight in pounds:");
		Scanner sc;
		sc = new Scanner(System.in);
		float weight = sc.nextFloat();
		this.weight=weight;
		if(weight < 0) {
			System.exit(0);
		}
		System.out.printf("Provide your height in inches:");
		sc = new Scanner(System.in);
		float height = sc.nextFloat();
		this.height = height;
		if(height < 0) {
			System.exit(0);
		}
	}
	private void readMetricData() {
		System.out.printf("Provide your weight in kilograms:");
		Scanner sc;
		sc = new Scanner(System.in);
		float weight = sc.nextFloat();
		this.weight=weight;
		if(weight < 0) {
			System.exit(0);
		}
		System.out.printf("Provide your height in meters:");
		sc = new Scanner(System.in);
		float height = sc.nextFloat();
		this.height = height;
		if(height < 0) {
			System.exit(0);
		}
		
	}
	private int readUnitType() {
		int type;
		System.out.printf("1) Imperial%n2)Metric");
		Scanner sc;
		sc= new Scanner(System.in);
		type = sc.nextInt();
		//in case of invalid entry
		while(type>2 || type<1) {
			System.out.println("Invalid entry, please provide a new number.");
			type= readUnitType();
		}
		//return 1 if imperial, 2 if metric
		this.type=type;
		return type;
	}
	private void readMeasurementData(int type) {
		//calls either readMetricData or readImperialData depending on unit type
		if(type==1) {
			readImperialData();
		}
		else if(type==2) {
			readMetricData();
		}
	}
	public void readUserData(){
		//uses readUnitType and readMeasurementData
		int type=readUnitType();
		readMeasurementData(type);
		/*Scanner sc;
		sc= new Scanner(System.in);
		height = sc.nextFloat();
		this.height=height;
		weight = sc.nextFloat();
		this.weight=weight;
		units = sc.nextLine();
		this.units=units;*/
		}
	public void calculateBMI() {
		//calculates user's BMI and BMI category
		float BMI;
		if(type==1) {
			BMI = 703 * this.weight / (this.height * this.height);
		}
		else {
			BMI = this.weight / (this.height * this.height);
		}
		this.BMI = BMI;
		calculateBMICategory();
		
	}
	private void calculateBMICategory() {
		if(this.BMI<18.5) {
			this.BMICategory = 1;
		}
		else if(this.BMI>=18.5 && this.BMI <=24.9) {
			this.BMICategory = 2;
		}
		else if(this.BMI >=25 && this.BMI <= 29.9) {
			this.BMICategory = 3;
		}
			else if(this.BMI>=30) {
				this.BMICategory = 4;
			}
		
	}
	public void displayBMI() {
		//prints the BMI value and category to standard output
		System.out.printf("Your BMI is: %f%n",this.BMI);
		System.out.printf("Your BMI Categroy is ");
		if(this.BMICategory==1) {
			System.out.println("Underweight");
		}
		else if(this.BMICategory == 2) {
			System.out.println("Normal Weight");
		}
		else if(this.BMICategory == 3) {
			System.out.println("Overweight");
		}
		else if(this.BMICategory == 4) {
			System.out.println("Obesity");
		}
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}
	public float getWeight() {
		return this.weight;
	}
	private void setWeight(float weight) {
		this.weight=weight;
	}
	public float getHeight() {
		return this.height;
	}
	private void setHeight(float height) {
			this.height=height;
		}
	public float getBMI() {
		return this.BMI;
	}
	public int getBMICategory() {
		return this.BMICategory;
	}
}
