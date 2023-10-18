import java.io.*;
import java.util.*;

public class Solution {
    static int isAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.compare(arr1, arr2);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s  = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        if(isAnagram(str1,str2) == 0){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
        
    }
}
