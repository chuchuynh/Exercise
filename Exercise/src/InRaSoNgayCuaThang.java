
public class InRaSoNgayCuaThang {
	private static final int INVALID_MONTH_DATE = -1;

	public static void main(String[] args) {
//		int songay = ngayCuaThang_Switch(10, 2017);
//		if (songay == INVALID_MONTH_DATE) {
//			System.out.println("Khong hop le");
//		} else {
//			System.out.println("So ngay cua thang la: " + songay);
//		}
		// soNgayCuaThang(2, 2017);
		// soNgayCuaThang(3, 2017);
		// soNgayCuaThang(4, 2017);
		// soNgayCuaThang(5, 2017);
		// soNgayCuaThang(6, 2017);
		// soNgayCuaThang(7, 2017);
		// soNgayCuaThang(8, 2017);
		// soNgayCuaThang(9, 2017);
		// soNgayCuaThang(10, 2017);
		// soNgayCuaThang(11, 2017);
		// soNgayCuaThang(12, 2017);
		ngayCuaThang_Switch1(-1, 2017);
		ngayCuaThang_Switch1(9, -1);
		ngayCuaThang_Switch1(9, 2017);
		ngayCuaThang_Switch1(10, 2017);
		ngayCuaThang_Switch1(11, 2017);
		ngayCuaThang_Switch1(12, 2017);
	}

	static void soNgayCuaThang(int month, int year) {
		if (((month > 12) || (month < 1)) || (year < 0)) {
			System.out.println("Nhap sai Thang hoac Nam. Kiem tra lai");
			return;
		}
		if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			System.out.println("So ngay cua thang " + month + " Nam " + year + " la: 30");
		} else {
			if (month == 2) {
				int songay = laNamNhuan(year) ? 29 : 28;
				System.out.println("So ngay cua thang " + month + " Nam " + year + " la:" + songay);
			} else {
				System.out.println("So ngay cua thang " + month + " Nam " + year + " la: 31");
			}
		}

	}

	static int ngayCuaThang_Switch(int month, int year) {
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (laNamNhuan(year))
				return 29;
			else
				return 28;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		default:
			return INVALID_MONTH_DATE;
		}
	}

	static void ngayCuaThang_Switch1(int month, int year) {
		if (((month > 12) || (month < 1)) || (year < 0)) {
			System.out.println("Nhap sai Thang hoac Nam. Kiem tra lai");
			return;
		}
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang " + month + "; Nam: " + year + " co 30 ngay");
			break;
		case 2:
			if (laNamNhuan(year)) {
				System.out.println("Thang " + month + "; Nam: " + year + " co 29 ngay");
			} else {
				System.out.println("Thang " + month + "; Nam: " + year + " co 28 ngay");
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang " + month + "; Nam: " + year + " co 31 ngay");
			break;
		default:
			break;
		}
	}

	static boolean laNamNhuan(int year) {
		return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	}
}
