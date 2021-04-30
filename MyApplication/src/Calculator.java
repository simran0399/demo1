import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		float num1 , num2, sum;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num1:");
		num1=sc.nextFloat();
		System.out.println("Enter num2:");
		num2=sc.nextFloat();
		sum = num1 + num2;
		System.out.println("Sum is: "+sum);
		sc.close();
	}

}
