import java.util.Scanner;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		do {
			System.out.println("Enter a number");
			if (counter < 3) {
				float value = scanner.nextFloat();
				System.out.println(value >= -5 && value <= 5);
			}
			int max = 0;
			int min = 0;
			if (counter >= 3 && counter <= 6) {
				int value = scanner.nextInt();
				if (value >= max)
					max = value;
				System.out.println(max);
				if (value <= min)
					min = value;
				System.out.println(min);
			}
			counter++;
		} while (counter != 6);
		scanner.close();
		System.exit(0);
	}

}
