
import java.util.Scanner;

public class Fah2Cel {

	public static void main(String[] args) {
		System.out.println("Enter a Fahreneit value that you want to convert into Celsius: ");

		Scanner sc = new Scanner(System.in);
		double Fahrenheit = sc.nextDouble();
		double Celsius = ((Fahrenheit - 32) / 1.8);
		System.out.println("Celsius: " + Celsius + " C");
		sc.close();
		
	}

}
