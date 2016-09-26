package charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharsetDemo {

	public static void bytesDemo() throws UnsupportedEncodingException {
		// charset next version
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
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		bytesDemo();
	}

}
