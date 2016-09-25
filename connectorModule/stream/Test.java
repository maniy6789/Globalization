package stream;

import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		// String str = "エンコーディングは難しくない";
		String str = "ンコ";
		byte[] b = str.getBytes("UTF-8");
		System.out.println("UTF-8");
		
		System.out.println(b.length);
		for(byte each : b) {
			System.out.print(Integer.toHexString(each)+ " ");
		}
		System.out.println();
		String test = new String(b, "UTF-8");
		System.out.println(test);
		b = str.getBytes("EUC-JP");
		for(byte each : b) {
			System.out.print(Integer.toHexString(each)+ " ");
		}
		System.out.println();
		test = new String(b, "EUC-JP");
		System.out.println(test);
		System.out.println("11111111111111111111111111100011".length());
		
	}

}
