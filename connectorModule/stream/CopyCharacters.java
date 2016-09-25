package stream;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;

        try {
            in = new FileInputStream("/Users/myakkala/shift-jis.txt");
            // TODO identify one more encoding other than UTF-8
            InputStreamReader insr = new InputStreamReader(in, "SHIFT-JIS");
            //out = new FileOutputStream("/Users/myakkala/outagain.txt");
            Charset cs = null;
            System.out.println(cs = Charset.defaultCharset());
            char[] cbuf = new char[200];
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
