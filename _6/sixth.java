package sixth;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sixth {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        if (a.length == d)
            return  a;

        for(int i=0;i<d ;){

            if(d > i && d > a.length){
                i=i+ i * (d/a.length);

            }else {
                int temp = a[0];
                int j=0;
                for ( j = 0; j < a.length-1; j++)
                    a[j] = a[j + 1];
                a[j] = temp;
                i++;
            }


        }
    return  a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] temp = { 1, 2, 3, 4, 5 };
        int[] result = rotLeft(temp, 4);

        System.out.println(Arrays.toString(result));


    }
}
