
public class SoNguyenTo {
	public static void main(String[] args) {
		laSoNguyenTo(-1);
//		laSoNguyenTo(5);
//		laSoNguyenTo(6);
//		laSoNguyenTo(100);

	}

	static void laSoNguyenTo(int num) {
		if (num <= 0) {
			System.out.println("So Nguyen To phai la so duong");
			return;
		}
		if (num == 1) {
			System.out.println("So 1 khong phai la so Nguyen To");
			return;
		}
		if (num == 2) {
			System.out.println("So 2 la so Nguyen To");
		} else {
			int temp = 0;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					temp++;
					break;
				}
			}
			if (temp == 0) {
				System.out.println("So " + num + " la so Nguyen To");
			} else {
				System.out.println("So " + num + " khong phai la so Nguyen To");
			}
		}
	}
}
