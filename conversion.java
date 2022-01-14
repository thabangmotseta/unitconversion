
import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {

		double kilograms;

		try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please enter kilograms:");
            kilograms = in.nextDouble();
        }

		double grams = kilograms * 1000;
		System.out.println(grams + " Grams");
        

       
	}
}
