import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] charList = str.toCharArray();
        for(int i = 0; i<str.length()/2; i++){
            if(charList[i] != charList[str.length()-i-1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
