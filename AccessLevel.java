/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesslevel;
import java.util.Scanner;

public class AccessLevel {
public static String Acces(int j,int[]a,int b )
{
    String s="";
    int d=0;
    while(d<j)
    {
        if(a[d]>=b)
        {
            s=s+"A";
        }
        else
            s=s+"D";
     d++;
    }
    
return s;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size=51,b, Permission=101;
        int [] array;
        Scanner scan = new Scanner(System.in); 
        while(size>=50)
        { System.out.println("What is the amount of element in the user");
        size=scan.nextInt();
        
        }
        array= new int[size];
        for(int i=0;i<=size-1;i++)
        {
            b=101;
            while(b>100)
            {System.out.println("what is the element of user will be between 0-100");   
            b=scan.nextInt();
            }
            array[i]=b;
        }
       
            do{
        System.out.println("what is the permission number betweeen 0-100");
        Permission=scan.nextInt();
            }while(Permission>100);
        
        System.out.println(Acces(size,array,Permission));
    }
    
}
