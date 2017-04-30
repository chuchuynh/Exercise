
public class InRaSoNgayCuaThang {
	public static void main(String[] args) {
		soNgayCuaThang(-1, 2017);
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

	static boolean laNamNhuan(int year) {
		return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	}
}
