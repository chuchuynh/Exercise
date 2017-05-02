
public class SoNguyenTo {
	public static void main(String[] args) {
		checkSoNguyenTo(-1);
		 checkSoNguyenTo(5);
		 checkSoNguyenTo(6);
		 checkSoNguyenTo(100);
	}

	static void checkSoNguyenTo(int num) {
		if (laSoNguyenTo(num)) {
			System.out.println(num + " la so nguyen to");
		} else {
			System.out.println(num + " ko phai la so nguyen to");
		}
	}
	
	static boolean laSoNguyenTo(int num) {
		if (num <= 0) {
			return false;
		}
		if (num == 1) {
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
