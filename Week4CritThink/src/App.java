import java.util.ArrayList;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		ArrayList<Double> nums = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter five floating point numbers");
		int i = 0;
		while(i < 5) {
			System.out.print((i + 1) + ": ");
			nums.add(scanner.nextDouble());
			scanner.nextLine();
			i++;
		}
		
		double total = 0;
		double maximum = Double.NEGATIVE_INFINITY;
		double minimum = Double.POSITIVE_INFINITY;
		for (double num: nums) {
			total += num;
			if(num > maximum) {
				maximum = num;
			}
			if (num < minimum) {
				minimum = num;
			}
		}
		System.out.println("total: " + total);
		System.out.println("Average: " + (total / nums.size()));
		System.out.println("Maximum: " + maximum);
		System.out.println("Minimum: " + minimum);
		System.out.println("interest on total at 20%: " + (total * .2));
		
		scanner.close();
		
	}
}
