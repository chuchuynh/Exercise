import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap nam: ");
		int year = input.nextInt();

		// Nam >= 5000, luc do chet mat roi biet lam gi nua :P
		while ((year <= 0) || (year >= 5000)) {
			System.out.println("Nam phai la so duong, lon hon 0 va nho hon 5000. Nhap lai");
			year = input.nextInt();

		}
		if (laNamNhuanHayKo(year)) {
			System.out.println("Day la Nam Nhuan");
		} else {
			System.out.println("Day khong phai la Nam Nhuan");
		}
	}

	// Nam Nhuan la nam chia het cho 400 hoac chia het cho 4 & khong chia het
	// cho 100
	static boolean laNamNhuanHayKo(int year) {
		return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	}

}
