import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Server {
    
    static String conversion(String str){

        char[] finalStr = new char[str.length()];
        for (int i=0 ; i<str.length() ; i++)
        {
            char element = str.charAt(i);

            if (element >= 'A' && element <='Z')
            {
                finalStr[i] = Character.toLowerCase(element);
            }
            else
            {

                finalStr[i] = Character.toLowerCase(element);

            }
        }
        
        String returnStream = String.valueOf(finalStr); 
        return returnStream;
        
    }


    public static void main(String[] args) {
    

        // Server obj = new Server();
        System.out.println("Server started");
        try {
        
            System.out.println("Waiting for the client");
            ServerSocket ss = new ServerSocket(10000);
            Socket soc  = ss.accept();
            System.out.println("Connection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Server say:  " + conversion(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    }

    



