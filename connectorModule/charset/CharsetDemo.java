package charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharsetDemo {

	public static void bytesDemo() throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		// スクリプト・ヘッダー・セクション
//		 String s = "Ab";
		char c[] = "\u8000".toCharArray();
		String s = new String(c);
		s = "A" + s ;
		System.out.println(s);
		byte[] b = s.getBytes("UTF-8");
		System.out.println("UTF-8");
		for(byte each : b) {
			System.out.print(Integer.toHexString(each)+ " ");
		}
		System.out.println("\nIn UTF-8 length of A is:" + b.length);
		System.out.println("UTF-16");
		b = s.getBytes("UTF-16");
		for(byte each : b) {
			System.out.print(Integer.toHexString(each)+ " ");
		}
		System.out.println("\nIn UTF-16 length of A is:" + b.length);
		System.out.println("UTF-16le");
		b = s.getBytes("UTF-16le");
		for(byte each : b) {
			System.out.print(Integer.toHexString(each)+ " ");
		}
		System.out.println("\nIn UTF-16le length of A is:" + b.length);
		System.out.println("UTF-16be");
		b = s.getBytes("UTF-16be");
		for(byte each : b) {
			System.out.print(Integer.toHexString(each)+ " ");
		}
		System.out.println("\nIn UTF-16be length of A is:" + b.length);
		System.out.println("Default");
		b = s.getBytes();
		for(byte each : b) {
			System.out.print(Integer.toHexString(each)+ " ");
		}
		System.out.println("\nDefault length of A in java is:" + b.length);
		//System.out.println(Charset.defaultCharset().displayName());
	}
	
	public static void hitMethod() {
		String s1 = "http://test-developer-edition.localhost.force.com:6109/css/img/icon/tasks16.png";
		String s2 = "http://test-developer-edition.localhost.force.com:6109/css/img/icon/tasks16.png";
		
		if (s1 == s2) {
			System.out.println("hit");
		}
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		bytesDemo();
		// hitMethod();
		
	}

}
