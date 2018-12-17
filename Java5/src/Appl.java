import java.util.Scanner;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Task 1
		int[] arr = { 10, -13, 45, -34, 4, -12, 60, -8, 9, -11 };

		int max = arr[0];
		int sumOfPositive = 0;
		int amountOfNegative = 0;
		int amountOfPositive = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] > 0) {
				sumOfPositive += arr[i];
				amountOfPositive++;
			}
			if (arr[i] < 0) {
				amountOfNegative++;
			}
		}
		System.out.println(max);
		System.out.println(sumOfPositive);
		System.out.println(amountOfNegative);
		System.out.println(amountOfNegative > amountOfPositive);

		// Task 2
		Employee[] employees = new Employee[5];

		employees[0] = new Employee();
		employees[0].name = "Ivan";
		employees[0].departmentNumber = 1;
		employees[0].salary = 5000;

		employees[1] = new Employee();
		employees[1].name = "Petro";
		employees[1].departmentNumber = 1;
		employees[1].salary = 3000;

		employees[2] = new Employee();
		employees[2].name = "Vasyl";
		employees[2].departmentNumber = 2;
		employees[2].salary = 55000;

		employees[3] = new Employee();
		employees[3].name = "John";
		employees[3].departmentNumber = 2;
		employees[3].salary = 4000;

		employees[4] = new Employee();
		employees[4].name = "Peter";
		employees[4].departmentNumber = 3;
		employees[4].salary = 15000;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of department");
		int departmentNumber = scanner.nextInt();

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].departmentNumber == departmentNumber) {
				System.out.println(employees[i].toString());
			}
		}

		for (int j = 1; j < employees.length; j++) {
			Employee e = employees[j];
			int i = j - 1;
			while (i >= 0 && employees[i].salary < e.salary) {
				employees[i + 1] = employees[i];
				i--;
			}
			employees[i + 1] = e;

		}

		for (Employee e : employees) {
			System.out.println(e.salary);
		}

		// Homework 1
		System.out.println("Enter the number of month");
		int numberOfMonth = scanner.nextInt();

		int[] months = { 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

		System.out.println(months[numberOfMonth - 1]);

		// Homework 2
		int sum = 0;
		int product = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter number");
			int value = scanner.nextInt();
			if (i < 5 && value > 0) {
				sum += value;
			} else {
				product = product * value;
			}
		}

		// Homework 3
		int[] arr3 = new int[5];
		int min = 0;
		int imin = 0;
		int iSecondPositive = 0;
		int positives = 0;
		int product1 = 1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number");
			int value = scanner.nextInt();
			if (value < 0) {
				break;
			}

			if (value > 0) {
				arr3[i] = value;
				product = product1 * arr3[i];
				positives++;
			}
			if (positives == 2) {
				iSecondPositive = i;
			}
			if (min > arr3[i]) {
				min = arr[i];
			}
		}

		/*
		 * int iSecondPositive = 0; int positives = 0; for (int i = 0; i < arr3.length;
		 * i++) { if (arr3[i] > 0) { positives++; } if (positives == 2) {
		 * iSecondPositive = i; break; } }
		 */

		scanner.close();
	}

}
