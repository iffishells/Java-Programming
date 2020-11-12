
import java.lang.*;

import org.w3c.dom.ElementTraversal;

import jdk.nashorn.internal.ir.ReturnNode;

public class Conversion {

    static String conversion(String str){

        char[] finalStr = new char[str.length()];
        for (int i=0 ; i<str.length() ; i++)
        {
            char element = str.charAt(i);

            if (element >= 'A' && element <='Z')
            {
                finalStr[i] = Character.toLowerCase(element);
            }
            else{
                finalStr[i] = Character.toLowerCase(element);
            }
        }
        
        String returnStream = String.valueOf(finalStr); 
        return returnStream;
        
    }

    public static void main(String[] args) {

       System.out.println( conversion("WELCOME to The PakistaN"));

        




    }
}
