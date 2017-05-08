public class NguyenAmPhuAm {
	
	enum nguyenam {
		a, 
		e,
		u,
		o,
		i;
	}
	
	
	
	public static void main(String[] args) {
		checkNguyenAmPhuAm("a");
//		checkNguyenAmPhuAm("b");
//		checkNguyenAmPhuAm("c");
//		checkNguyenAmPhuAm("d");
//		checkNguyenAmPhuAm("e");
//		checkNguyenAmPhuAm("f");
//		checkNguyenAmPhuAm("u");
//		checkNguyenAmPhuAm("i ");
	}
	
	public static void checkNguyenAmPhuAm(String c) {
		if (laNguyenam(c)) {
			System.out.println(c.trim() + " la nguyen am");
		} else {
			System.out.println(c.trim() + " la phu am");
		}
	}
	
	public static boolean laNguyenam(String c) {
		int size = nguyenam.values().length;
		int i = 0;
		while (i < size) {
			String trim = c.toLowerCase().trim();
			String giatricuaenumtaivitrithuI = nguyenam.values()[i].toString();
			if (trim.equals(giatricuaenumtaivitrithuI)) {
				return true;
			}
			i++;
		}
	
		return false;
	}
}
