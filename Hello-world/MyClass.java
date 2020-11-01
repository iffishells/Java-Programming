import java.util.jar.Attributes.Name;

import javax.swing.text.StyledEditorKit;

import jdk.nashorn.internal.ir.ReturnNode;

public class MyClass{
    public static void main(String[] args){
       
        
        func("john");
        int age=age(2);
        System.out.println(age);    
    }

    static void func(String Name){
        System.out.println("Name is  : "+ Name);
    }
    
    static int age(int x){
        return x +5;

    
    }

}