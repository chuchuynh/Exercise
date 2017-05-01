
public class inRaGiaiThua {
	public static void main(String[] args) {
		NhapSo(3);
		NhapSo(4);
		NhapSo(5);
		System.out.println(giaithua(5) + "");
	}

	static void NhapSo(int num) {
		int temp = 1;
		for (int i = 1; i <= num; i++) {
			temp = temp * i;
		}
		System.out.println("Giai thua cua so vua nhap la: " + temp);
	}

	static int giaithua(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return n * giaithua(n - 1);
	}
}
