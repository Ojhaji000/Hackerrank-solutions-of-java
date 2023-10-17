import java.util.*;

public class Solution {
    static void getSmallestAndLargest(String str, int num){        

        String largest= "A", smallest = "z";

        for(int i = 0; i< str.length()-num+1; i++){
            if(smallest.compareTo(str.substring(i,i+num)) > 0){
                smallest = str.substring(i,i+num);
            }
            if(largest.compareTo(str.substring(i,i+num)) < 0){
                largest = str.substring(i,i+num);
            }
        }
        System.out.println(smallest + "\n" + largest);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int num = input.nextInt();
        getSmallestAndLargest(str, num);

    }
}
