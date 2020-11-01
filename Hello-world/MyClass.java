import java.util.jar.Attributes.Name;

import javax.swing.text.StyledEditorKit;

import jdk.nashorn.internal.ir.ReturnNode;

public class MyClass{
    public static void main(String[] args){
       
        
        int num1 =  plusMethod(2, 3);
        System.out.println( "Num1 : "+ num1);
        double num2  = plusMethod(3.4, 8.7);
        System.out.println(num2);
    

    }

    static int plusMethod(int x , int y){

        return x+y;
    }
    // according to the parameter function is calling
    static double plusMethod(double x , double y){

        return x +y;
    }

}