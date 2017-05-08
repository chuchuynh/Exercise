public class In12Hen {
	
	public static void main(String[] args) {
		xuongnuihen(9);
	}
	
	public static void xuongnuihen(int n) {
		int i = 1;
		do {
			inXuogNui(i);
			System.out.println();
			i++;
		} while (i <= n);
	}
	
	public static void inXuogNui(int i) {
		int start = 1;
		do {
			System.out.print(start);
			start ++;
		} while (start <= i);
	}
}
