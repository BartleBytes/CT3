package my_CT3;
import java.util.Scanner; 

public class My_float {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter five floating-point values:");
			
			double total = 0;
			double maximum = Double.MIN_VALUE;
			double minimum = Double.MAX_VALUE;
			int count = 0;
			
			
		       while (count < 5) {
		            try {
		                System.out.print("Enter value " + (count + 1) + ": ");
		                double value = scanner.nextDouble();
		                total += value;
		                if (value > maximum) {
		                    maximum = value;
		                }
		                if (value < minimum) {
		                    minimum = value;
		                }
		                count++;
		            } catch (Exception e) {
		                System.out.println("Invalid input. Please enter a valid floating-point value.");
		                scanner.next(); // clear the invalid input
		            }
		        }
			double average = total / 5;
			
			System.out.println("Total: " + total);
			System.out.println("Average: " + average);
			System.out.println("Maximum: " + maximum);
			System.out.println("Minimum: " + minimum);
			
			double interest = total * .20;
			System.out.println("Interest on total at 20%: " + interest);
			
			scanner.close();
		}
	}
