import java.net.Socket;
import java.nio.MappedByteBuffer;

// import jdk.internal.org.jline.utils.InputStreamReader;

import java.io.*;
// import java.io.Buffered  Reader;
import java.io.PrintWriter;


public class Conversion{


    public static void main(String[] args) {
        
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String str = userInput.readLine();
            System.out.println("nrngnirngringir : " +str);

    }
        
}
