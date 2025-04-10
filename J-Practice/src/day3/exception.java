package day3;

import java.util.*;
public class exception {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
      
        try
        {
           String str = sc.next();
           int n = Integer.parseInt(str);
           System.out.println("Result:"+n);
        }
         
        catch(NumberFormatException e)
        {
            System.out.println("Exception: "+e);
        }
         
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}
      