
public class inSoTrongChuoiKiTu {
	public static void main(String[] args) {
		NhapChuoiKiTu("Number 12 la so");
		
	}
	static void NhapChuoiKiTu (String chuoi){
		for (int i = 0; i < chuoi.length(); i++) {
			if (Character.isDigit(chuoi.charAt(i))){
				System.out.println(i);
			}
			
		}
	}
}
