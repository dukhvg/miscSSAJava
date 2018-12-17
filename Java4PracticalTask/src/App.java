import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Task 1
		int x = 5;
		int y = 6;
		int z = 7;

		System.out.println(x % 2 != 0);
		System.out.println(y % 2 != 0);
		System.out.println(z % 2 != 0);

		// Task 2
		DayOfWeek dayOfWeek = null;
		int dayNumber = 2;
		switch (dayNumber) {
		case 1:
			dayOfWeek = DayOfWeek.MONDAY;
			break;
		case 2:
			dayOfWeek = DayOfWeek.TUESDAY;
			break;
		case 3:
			dayOfWeek = DayOfWeek.WEDNESDAY;
			break;
		case 4:
			dayOfWeek = DayOfWeek.THURSDAY;
			break;
		case 5:
			dayOfWeek = DayOfWeek.FRIDAY;
			break;
		case 6:
			dayOfWeek = DayOfWeek.SATURDAY;
			break;
		case 7:
			dayOfWeek = DayOfWeek.SUNDAY;
			break;
		default:
			System.out.println("No such day");
			System.exit(0);
		}

		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.GERMAN));
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.FRENCH));

		// Task 3
		Locale locale = new Locale("uk", "ua");
		Locale inLocale = new Locale("en", "us");
		Continent continent = null;
		String countryName = locale.getDisplayCountry(inLocale);
		switch (countryName) {
		case "Ukraine":
		case "Poland":
			continent = Continent.EURASIA;
			break;
		case "United States":
		case "Canada":
			continent = Continent.NORTH_AMERICA;
			break;
		case "Brazil":
		case "Argentina":
			continent = Continent.SOUTH_AMERICA;
			break;
		case "Algeria":
		case "Egypt":
			continent = Continent.AFRICA;
			break;
		case "Australia":
		case "New Zealand":
			continent = Continent.AUSTRALIA;
			break;
		default:
			System.out.println("No such country");
			System.exit(0);
		}

		System.out.println(continent.toString());

		// Task 4
		Scanner scanner = new Scanner(System.in);

		Product mostExpensiveProduct = null;
		Product maxQuantityProduct = null;

		int counter = 0;

		do {
			Product product = new Product();

			System.out.println("Enter a product name");
			product.name = scanner.next();

			System.out.println("Enter a product price");
			product.price = scanner.nextDouble();

			System.out.println("Enter a product quantity");
			product.quantity = scanner.nextFloat();
			
			scanner.reset();

			if (mostExpensiveProduct == null) {
				mostExpensiveProduct = product;
			}

			if (maxQuantityProduct == null) {
				maxQuantityProduct = product;
			}

			if (product.price > mostExpensiveProduct.price) {
				mostExpensiveProduct = product;
			}

			if (product.quantity > maxQuantityProduct.quantity) {
				maxQuantityProduct = product;
			}
			counter++;

		} while (counter != 4);

		System.out.println(mostExpensiveProduct.toString());
		System.out.println(maxQuantityProduct.toString());

		scanner.close();

	}

}
