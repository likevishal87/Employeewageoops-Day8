import java.util.Random;

public class Dailyemployee {

	int random;
	int Wage_per_Hour;
	int Hour;
	double EmployeeWage;

	Dailyemployee(int Wage) {
		Wage_per_Hour = Wage;
	}

	public int isCheck() {
		random = randomNumber();
		if (random == 1) {
			System.out.println(" Working is  Full Time Wage :");
			Hour = 8;
		} else {
			System.out.println("Employee is absent");
			Hour = 0;
		}
		return Hour;
	}

	public int randomNumber() {
		Random r = new Random();
		random = r.nextInt(2);
		return random;
	}

	public void calculate() {
		int hr = isCheck();
		EmployeeWage = Wage_per_Hour * hr;
		System.out.println("Employee Wage Per Day is  " + EmployeeWage);
	}

	public static void main(String[] args) {

		Dailyemployee d = new Dailyemployee(20);
		d.calculate();
	}

}