package first;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer,Integer> elements= new HashMap();
        for (int i=0;i<ar.length;i++){
            if ( elements.containsKey(ar[i])){
                elements.put(ar[i],elements.get(ar[i])+1);
            }else
            {
                elements.put(ar[i],1);
            }
        }
        int final_mapping=0;
        for (Integer key : elements.keySet() ){

            final_mapping=final_mapping+elements.get(key)/2;

        }

        return  final_mapping;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arr[]={1 ,1 ,3 ,1 ,2 ,1 ,3 ,3, 3 ,3 };
        int result = sockMerchant(10, arr);
        System.out.println(result);

    }
}
