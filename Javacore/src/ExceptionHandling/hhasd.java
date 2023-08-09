package ExceptionHandling;

import java.io.*;
import java.util.*;

public class hhasd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in  = new Scanner(System.in);
    //String input1=in.next();
    //String input2=in.next();
    
    try{
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x/y);
    }catch(InputMismatchException e){
        System.out.println("java.util.InputMismatchException");
        
    }
    catch(ArithmeticException e){
        System.out.println(e);
        
    }
    System.out.println("dsd");
   
    
    }
}
