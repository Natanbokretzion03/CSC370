/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dirsort;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author Natan
 */
public class Dirsort {
 public static void sort(String[] d) {
        Arrays.sort(d, Comparator.comparingInt(Dirsort::count).thenComparing(String::compareTo));
    }

    private static int count(String p) {
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '/') {
                count++;
            }
        }
        return count;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
            String[] dirs = {"/","/usr/","/usr/local/","/usr/local/bin/","/games/","/games/snake/","/homework/","/temp/downloads/"};
        sort(dirs);
        System.out.println(Arrays.toString(dirs));
     String[] dirs2 = {"/usr/","/usr/local/","/bin/","/usr/local/bin/","/usr/bin/","/bin/local/","/bin/local/"};
        sort(dirs2);
        System.out.println(Arrays.toString(dirs2));
        String[] dirs3 = {"/","/a/","/b/","/c/","/d/","/e/","/f/","/g/"};
        sort(dirs3);
        System.out.println(Arrays.toString(dirs3));
        String[] dirs4 = {"/","/a/","/b/","/c/","/d/","/e/","/f/","/g/","/a/a/","/b/g/c/","/g/f/"};
        sort(dirs4);
        System.out.println(Arrays.toString(dirs4));
        String[] dirs5 = {"/a/b/c/d/e/f/g/h/i/j/k/l/m/n/","/o/p/q/r/s/t/u/v/w/x/y/z/"};
        sort(dirs5);
        System.out.println(Arrays.toString(dirs5));
        String[] dirs6 = {"/a/b/","/ab/cd/","/c/d/","/a/b/c/","/ab/c/d/","/a/bc/d/","/a/b/cd/"};
        sort(dirs6);
        System.out.println(Arrays.toString(dirs6));
        
    }
    
}
