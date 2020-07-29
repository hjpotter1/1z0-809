package test;

import java.io.BufferedReader;
        import java.io.CharArrayReader;
        import java.io.IOException;

import java.io.BufferedReader;
import java.io.StringReader;

 class Demo {
    public static void main(String[] args) throws Exception {
        String s ="12345";
        StringReader sr = null;
        BufferedReader br = null;

        try {
            sr = new StringReader(s);

            // create new buffered reader
            br = new BufferedReader(sr);

            // reads and prints BufferedReader
            System.out.println((char)br.read());

            // mark invoked at this position
            br.mark(2);
            System.out.println("mark() invoked");
            System.out.println((char)br.read());

            // reset() repositioned the stream to the mark
            br.reset();
            System.out.println("reset() invoked");
            System.out.println((char)br.read());

        } catch (Exception e) {
            // exception occurred.
            e.printStackTrace();
        } finally {
            // releases any system resources associated with the stream
            if(sr!=null)
                sr.close();
            if(br!=null)
                br.close();
        }
    }
}

public class Test123 {
}
