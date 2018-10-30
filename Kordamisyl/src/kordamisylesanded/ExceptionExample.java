package kordamisylesanded;

public class ExceptionExample {
	
	public static void main(String[] args) {
		System.out.println(calculateSalary(-8, 5));
	}

	public static double calculateSalary(int hours, double hoursRate) {
		if (hoursRate < 0) {
			throw new IllegalArgumentException("Tunnitasu ei tohi olla negatiivne. Sisend oli " + hoursRate);
		}
		if (hours < 0) {
			throw new IllegalArgumentException("Tundide arv ei tohi olla negatiivne. Sisend oli " + hours);
		}
		if (hoursRate < 2.97) {
			throw new IllegalArgumentException("Tunnitasu ei tohi olla negatiivne v�i alla miinimumpalga. Sisend oli " + hoursRate);
		}
		
		return hours * hoursRate;
	}
}
