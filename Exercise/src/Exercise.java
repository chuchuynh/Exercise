
public class Exercise {
	
	public static void main(String[] args) {
		phuongtrinhbacnhat(4, 8);
		phuongtrinhbacnhat(4, -8);
		phuongtrinhbac2(0, 4, 8);
	}

	static void phuongtrinhbacnhat(int a, int b) {
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

	static void phuongtrinhbac2(int a, int b, int c) {
		
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
			System.out.println("Nghiem cua phuong trinh la: x1 = 1; x2 = " + -c / a);
			return;
		}
		double D = (b * b) - 4 * a * c;

		if (D < 0) {
			System.out.println("phuong trinh vo nghiem");
			return;
		}
		if (D == 0) {
			StringBuilder builder = new StringBuilder();
			builder.append("phuong trinh co nghiem kep, x1 = x2 =");
			builder.append(String.valueOf((-b / 2 * a)));
			System.out.println(builder.toString());
			return;
		}
	}
	
	static boolean isTruongHopDacbiet1(int a, int b, int c) {
		return ((a != 0) && (a + b + c == 0));
	}
	
	static boolean isTruongHopDacbiet2(int a, int b, int c) {
		return (a != 0) && (a - b + c == 0);
	}
}
