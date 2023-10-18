import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        if(!s.hasNext()){
            System.out.println(0);
            return;
        }
        String str = s.nextLine().trim();
        String[] arr = str.split("[ !,?._'@+]+");
        System.out.println(arr.length);
        for(String temp : arr){
            System.out.println(temp);
        }
    }
}
