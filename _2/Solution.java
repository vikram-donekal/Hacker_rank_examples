package second;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int final_return_value=0;
        int count_value=0;
        for(char UP_down: s.toCharArray()){
            if (UP_down =='U'){

                count_value++;
                if (count_value==0)
                    final_return_value++;
            }
            if(UP_down=='D'){
                count_value--;
            }

        }
        System.out.println(final_return_value);
return  final_return_value;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int result = countingValleys(8, "UDDDUDUU");

    }
}

