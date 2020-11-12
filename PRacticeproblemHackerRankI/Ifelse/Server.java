import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jdk.tools.jlink.internal.plugins.StripNativeCommandsPlugin;


public class Server {
    

    public static boolean isStringOnlyAlphabet(String str) 
    { 
        return ((!str.equals("")) 
                && (str != null) 
                && (str.matches("^[a-zA-Z]*$"))); 
    } 
     


    static String conversion(String str){
        String msg = "Please send an Aplhabet";

        if(isStringOnlyAlphabet(str)){
            char[] finalStr = new char[str.length()];
            for (int i=0 ; i<str.length() ; i++)
            {
                char element = str.charAt(i);
                System.out.println("in if condition");
                if (element >= 'A' && element <='Z'){
                    
                    finalStr[i] = Character.toLowerCase(element);
                }
                else{
                    finalStr[i] = Character.toUpperCase(element);
    
                }
            }
            
            
            String returnStream = String.valueOf(finalStr); 
            return returnStream;
    

        }
        else{
            return msg;
        }

        
    }


    public static void main(String[] args) {
    

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

    



