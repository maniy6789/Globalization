package demo;

import java.util.*;

public class GlobalHelloWorld {

	public static void main(String[] args) {
		
		// fetching default locale, printing language and country
		// check whether we can use other than language & country
		// It obeys RFC 4647 & 5646
		
		/* 
		 * The Java Virtual Machine sets the default locale during startup
		 * based on the host environment.
		 * It is used by many locale-sensitive methods if no locale is explicitly specified.
		 */
		Locale l = Locale.getDefault();
		System.out.println("Language: " + l.getLanguage());
		System.out.println("Country: " + l.getCountry());
		
		// using India locale
		String lang = "hi";
		String country = "In";		
		l = new Locale(lang, country);
		ResourceBundle rb = ResourceBundle.getBundle("demo.Bundle", l);		
		System.out.println(rb.getString("wish"));
		
		
		// using US locale
		lang = "en";
		country = "US";
		l = new Locale(lang, country);
		rb = ResourceBundle.getBundle("demo.Bundle", l);		
		System.out.println(rb.getString("wish"));
	}

}
