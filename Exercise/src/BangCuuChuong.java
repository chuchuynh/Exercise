public class BangCuuChuong {
	
	public static void main(String[] args) {
		sochanle(10);
	}
	
	public static void sochanle(int n) {
		String chan = "";
		String le = "";
		
		for (int i = 0; i < n ;i ++) {
			if (i % 2 == 0) {
				chan = chan + i + ",";
			} else {
				le = le + i + ",";
			}
		}
		
		if (!chan.equals("")) {
			chan = chan.substring(0, chan.length() - 1);
		}
		
		if (!le.equals("")) {
			le = le.substring(0, le.length() - 1);
		}
		
		System.out.println("So chan:" + chan);
		System.out.println("So le" + le);
	}
}
