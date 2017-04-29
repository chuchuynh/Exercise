
public class Exercise {
	
	public static void main(String[] args) {
//		phuongtrinhbacnhat(4, 8);
//		phuongtrinhbacnhat(4, -8);
		phuongtrinhbac2(1, -2, 1);
		phuongtrinhbac2(2, 5, 2);
	}

	static void phuongtrinhbacnhat(double a, double b) {
		double x = (-b) / a;
		
		if (a == 0) {
			System.out.println("phuong trinh vo nghiem");
		}
		
		if (b < 0) {
			System.out.println("Nghiem cua phuong trinh " + a + "x" + b + "= 0 la: " + x);
		} else {
			System.out.println("Nghiem cua phuong trinh " + a + "x+" + b + "= 0 la: " + x);
		}
	}

	static void phuongtrinhbac2(double a, double b, double c) {
		
		if (a == 0) {
			System.out.println("Day la phuong trinh bac nhat");
			phuongtrinhbacnhat(b, c);
			return;
		}
		
		if (isTruongHopDacbiet1(a, b, c)) {
			System.out.println("Nghiem cua phuong trinh la: x1 = 1; x2 = " + c / a);
			return;
		}
		if (isTruongHopDacbiet2(a, b, c)) {
			System.out.println("Nghiem cua phuong trinh la: x1 = -1; x2 = " + -c / a);
			return;
		}
		
		double delta = getDeltaFrom(a, b, c);

		if (delta < 0) {
			System.out.println("phuong trinh vo nghiem");
			return;
		}
		
		if (delta == 0) {
			StringBuilder builder = new StringBuilder();
			builder.append("phuong trinh co nghiem kep, x1 = x2 =");
			builder.append(String.valueOf((-b / 2 * a)));
			System.out.println(builder.toString());
			return;
		}
		
		if (delta > 0){
			StringBuilder builder = new StringBuilder();
			builder.append("Phuong trinh co nghiem 2 nghiem").append("\n");
			builder.append("   X1 = ").append(tinhNghiem1(a, b, c, delta)).append("\n");;
			builder.append("   X2 = ").append(tinhNghiem2(a, b, c, delta));
			System.out.println(builder.toString());
			return;
		}
	}
	
	static double tinhNghiem1(double a, double b, double c, double delta) {
		return (-b + Math.sqrt(delta)) / (2*a);
	}
	
	static double tinhNghiem2(double a, double b, double c, double delta) {
		return (-b - Math.sqrt(delta))/ (2*a);
	}
	
	static double getDeltaFrom(double a, double b, double c) {
		return (b * b) - 4 * a * c;
	}
	
	static boolean isTruongHopDacbiet1(double a, double b, double c) {
		return ((a != 0) && (a + b + c == 0));
	}
	
	static boolean isTruongHopDacbiet2(double a, double b, double c) {
		return (a != 0) && (a - b + c == 0);
	}
}
