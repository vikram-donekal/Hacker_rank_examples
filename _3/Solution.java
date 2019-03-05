package third;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

            int steps=0;
            for(int i=0;i<c.length-1;){
                    if(i+2<c.length-1){

                        if (c[i+2] !=1){
                            i=i+2;
                        }else
                            i=i+1;
                    }else {
                        if (i+2 ==c.length-1){
                            if (c[i+2] !=1){
                                i=i+2;
                            }
                            else
                                i=i+1;
                        }else
                        i=i+1;


                    }
                    steps++;

            }
            return  steps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int c[]={0 ,0 ,1 ,0, 0, 1, 0  };
        int result = jumpingOnClouds(c);
        System.out.println(result);


    }
}
