import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap nam: ");
		int year = input.nextInt();
		if (year < 0) {
			System.out.println("Nhap sai");
			return;
		}
		if (laNamNhuanHayKo(year)) {
			System.out.println("Day la Nam Nhuan");
		} else {
			System.out.println("Day khong phai la Nam Nhuan");
		}
	}

	static boolean laNamNhuanHayKo(int year) {
		return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	}
}
