package Task2;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
