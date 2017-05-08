
public class inRaNamConGi {
	public static void main(String[] args) {
//		System.out.println(layCan(2017));
//		System.out.println(layCan(0));
//		System.out.println(layCan(-2017));
//		System.out.println(layChi(2017));
//		System.out.println(layChi(1982));
//		System.out.println(layChi(1984));
//		System.out.println(layChi(1983));
//
		System.out.println(layCanChi(2017));
		System.out.println(layCanChi(1982));
		System.out.println(layCanChi(1984));
	}

	static String layCanChi(int year){
		return layCan(year)+" " + layChi(year);
	}
	
	
	static String layCan(int year) {
		if (year <= 0) {
			return "Ko hop le";
		}

		String namDangChuoi = String.valueOf(year);
		char kitucuoi = namDangChuoi.charAt(namDangChuoi.length() - 1);
		switch (kitucuoi) {
		case '0':
			return "Canh";
		case '1':
			return "Tân";
		case '2':
			return "Nhâm";
		case '3':
			return "Quý";
		case '4':
			return "Giáp";
		case '5':
			return "Ất";
		case '6':
			return "Bính";
		case '7':
			return "Đinh";
		case '8':
			return "Mậu";
		case '9':
			return "Kỷ";
		default:
			return "";

		}

	}

	static String layChi(int year) {
		if (year <= 0) {
			return "Ko hop le";
		}

		year = year - 3;
		year = year % 12;
		switch (year) {
		case 1:
			return "Tí";
		case 2:
			return "Sửu";
		case 3:
			return "Dần";
		case 4:
			return "Mẹo";
		case 5:
			return "Thìn";
		case 6:
			return "Tị";
		case 7:
			return "Ngọ";
		case 8:
			return "Mùi";
		case 9:
			return "Thân";
		case 10:
			return "Dậu";
		case 11:
			return "Tuất";
		case 12:
			return "Hợi";
		default:
			return "Ko hop le";
		}
	}
}
