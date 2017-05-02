
public class inSoTrongChuoiKiTu {
	public static void main(String[] args) {
		NhapChuoiKiTu1("4Number 12s33323  ff- 32323 445    $#%^& 213r5323232 la so1");
		NhapChuoiKiTu(null);
		NhapChuoiKiTu("");
	}

	static void NhapChuoiKiTu(String chuoi) {
		if (chuoi == null || chuoi.equals("")) {
			System.out.println("Khong co ki tu nao la so");
			return;
		}
		int size = chuoi.length();
		for (int i = 0; i < size; i++) {
			if (kiTuLaSo(chuoi.charAt(i))) {
				System.out.print(chuoi.charAt(i));
			}
		}
	}
	

	static void NhapChuoiKiTu1(String chuoi) {
		if (chuoi == null || chuoi.equals("")) {
			System.out.println("Khong co ki tu nao la so");
			return;
		}
		char[] chars = chuoi.toCharArray();
		for (char c: chars) {
			if (kiTuLaSo(c)) {
				System.out.print(c);
			}
		}
	}

	static boolean kiTuLaSo(char i) {
		return i == '0' 
				|| i == '1'
				|| i == '2' 
				|| i == '3' 
				|| i == '4' 
				|| i == '5' 
				|| i == '6' 
				|| i == '7' 
				|| i == '8'
				|| i == '9';
	}
}
