import java.util.Random;

public class Addparttime {

	int random;
	int Wage_per_Hour;
	int Hour;
	double EmployeeWage;

	void AddPartTime(int Wage) {
		Wage_per_Hour = Wage;
	}

	public int isCheck() {
		random = randomNumber();
		if (random == 1) {
			System.out.println(" Working is  Full Time Wage :");
			Hour = 8;
		} else if (random == 2) {
			System.out.println(" Working is  part Time Wage :");
			Hour = 4;
		} else {
			System.out.println("Employee is absent");
			Hour = 0;
		}
		return Hour;
	}

	public int randomNumber() {
		Random r = new Random();
		random = r.nextInt(3);
		return random;
	}

	public void calculate() {
		EmployeeWage = Wage_per_Hour * Hour;
		System.out.println("Employee Wage Per Day is  " + EmployeeWage);
	}

	public static void main(String[] args) {

		Addparttime d = new Addparttime();
		d.calculate();
	}

}
