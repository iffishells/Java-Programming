import java.net.Socket;
import java.nio.MappedByteBuffer;

// import jdk.internal.org.jline.utils.InputStreamReader;

import java.io.*;
// import java.io.Buffered  Reader;
import java.io.PrintWriter;


public class Client{


    public static void main(String[] args) {
        
        try{

            System.out.println("client started ");


            Socket soc = new Socket("localhost",10000);
            
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter String");
           
            String str = userInput.readLine();
           
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
           
            out.println(str);
           
            BufferedReader in = new BufferedReader( new InputStreamReader(soc.getInputStream()));
           
            System.out.println(in.readLine());
        }
        catch(Exception e)
        {
            e.printStackTrace();               
        }
    }
    
}
