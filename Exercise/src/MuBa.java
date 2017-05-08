public class MuBa {
	
	public static void main(String[] args) {
		muBa(10);
	}
	
	public static void muBa(int n) {
		int i = 1;
		while (i <= n) {
			System.out.println("Mu ba cua [" + i + "] la: " + tinhMuBa(i));
			i++;
		}
	}
	
	public static int tinhMuBa(int i) {
		return i * i * i;
	}
}
