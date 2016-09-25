package stream;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;

        try {
            in = new FileInputStream("/Users/myakkala/Mandarin.txt");
            BufferedInputStream bis = new BufferedInputStream(in);
            InputStreamReader insr = new InputStreamReader(bis);
            char[] cbuf = new char[20];
            int c;
            while ((c = insr.read(cbuf)) != -1) {
                System.out.println(cbuf);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
        
    }
}
