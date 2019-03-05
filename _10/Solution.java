package _10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int count=0;

        for (int i=0;i<s.length();i++){

            for(int j=i;j<s.length();j++){
                for (int k=i+1;k<s.length();k++){

                    String outer =s.substring(i,j+1);

                    int length =s.substring(i,j+1).length();
                    if (k+length < s.length()) {

                      String inner =s.substring(k, k+ length);
                        if ( check(outer,inner)) {
                            count++;
                        }
                    }else {
                        if (  outer.length() >= s.substring(k).length() && check(outer,s.substring(k))) {
                            count++;
                        }
                    }
                }
            }
        }
return  count;

    }


    public static  Boolean check(String input,String  compareTo){
        char[] charFromWord = input.toCharArray();
        char[] charFromAnagram = compareTo.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }






    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


            int result = sherlockAndAnagrams("fhithnigqftuzzgpdiquhlsozksxxfreddmsmvqgfgzntphmgggszwtkcbmjsllwtukgqvpvxvmatuanbeossqwtpgzbagaukmta\n");
            System.out.println("out put --->"+result);
     }
}
