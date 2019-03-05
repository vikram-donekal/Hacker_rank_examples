package _13;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {


        List<Integer> input =Arrays.stream(prices).sorted().mapToObj(e -> (int) e ).collect(Collectors.toList());

        List<Integer> output = new ArrayList<>();

        for ( Integer a : input){
            if (k > 0){
                k =k -a;
                if (k> 0)
                    output.add(a);
            }
        }


        return  output.size();


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int []prices ={1, 12, 5 ,111, 200, 1000, 10};
        int k=50;
        int result = maximumToys(prices, k);
        System.out.println("out put ---->"+result);
}
}
