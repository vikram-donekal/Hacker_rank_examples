package _12;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {

        int total_swaps=0;


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {

                    total_swaps++;
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }

        }
        System.out.println("Array is sorted in "+total_swaps+" swaps.");

        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {




        int [] arr= {3,2,1};

        countSwaps(arr);

        scanner.close();
    }
}
