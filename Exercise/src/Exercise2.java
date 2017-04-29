
public class Exercise2 {
	public static void main(String[] args) {
		xuatracophainamnhuankhong(2004);
		xuatracophainamnhuankhong(4);
		xuatracophainamnhuankhong(-1);
	}

	static void xuatracophainamnhuankhong(int year) {
		if (isNamNhuan(year)) {
			System.out.println("Nam " + year + " la nam nhuan");
		} else {
			System.out.println("Nam " + year + " ko phai la nam nhuan");
		}
	}

	static boolean isNamNhuan(int year) {
		return ((year % 4 == 0) && (year % 100 != 0));
	}
}
