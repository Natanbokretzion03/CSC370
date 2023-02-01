/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runlengthencode;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Natan
 */
public class RunLengthEncode {
public static String Runlength(String s)
{
    int max= 4,i=0;
    String a ="";
    
    
    
    for(int n=0;n<s.length();n++)
    {int count=1;
        while(n<s.length()-1&& s.charAt(n)==s.charAt(n+1))
        {
            count++;
            
            n++;
        }
        if(count>1 &&count<=4)
        {
            for(int t=1;t<count;t++)
            {
               a=a+s.charAt(n);
               
            }
            
        count =1;
        }
        if(count>max)
        {   
          
           a=a+"/";
                if(count<10)
                {
                    a=a+"0";
                }  
               a=a+count;
              
                 
        }
                  
     a=a+s.charAt(n);
            
        
    }
       
    return a;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("input a RunLength");
        String string=scan.nextLine();
  System.out.println(Runlength(string));
        
        
        
    }
    
}
