import java.text.DecimalFormat;

public class CanBacBa {
	private static final double DO_CHINH_XAC = 0.0000001;
	
	public static void main(String[] args) {
		for (int i =0; i < 100000; i++) {
			System.out.println("Can bac ba cua " + i + " la: " + canbacba(i));
		}
	}
	
	public static double canbacba(int n) {
		double result = 0;
		while (result * result * result < n) {
			result += DO_CHINH_XAC;
		}
		Math.sqrt(4);
		DecimalFormat df = new DecimalFormat("###.######");
		return Double.parseDouble(df.format(result));
	}
	
	public static double lamtronso(double result, int n) {
		return Math.round(result);
	}
}
