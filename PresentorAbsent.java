import java.util.Random;

public class PresentorAbsent {

	int random;

	public boolean isCheck(int random) {
		if (random == 1) {
			return true;
		}
		return false;
	}

	public int random() {
		Random r = new Random();
		random = r.nextInt(2);
		return random;
	}

	public void check() {
		if (isCheck(random) == true) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args) {
		PresentorAbsent E = new PresentorAbsent();
		E.check();
	}

}
