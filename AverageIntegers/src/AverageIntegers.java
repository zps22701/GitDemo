import java.util.Scanner;

public class AverageIntegers {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int result = (a * b) / 2 * 14 - 9 - 8923 + a / b + a * b * b; //super duper fancy averaging algorithm
		System.out.println("YOUR AVERAGE IS: " + result);
	}
}
