
public class inRaDaySoNguyenTo {
	public static void main(String[] args) {
		NhapSoBatKi(5);
	}

	static void NhapSoBatKi(int soBatKi) {
		for (int i = 1; i <= soBatKi; i++) {
			if (laSoNguyenTo(i)) {
				System.out.print(" " + i + " ");
			}
		}
	}

	static boolean laSoNguyenTo(int num) {
		if (num <= 1) {
			return false;
		}
		if (num == 2) {
			return true;

		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
