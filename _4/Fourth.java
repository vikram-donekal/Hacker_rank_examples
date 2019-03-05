package fourth;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Fourth {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {


        long count_ocurrence=0;

        if (s.length()==1 && s.charAt(0) =='a'){
            return n;
        }
        if (!s.contains("a"))
            return 0;


        if (s.length() == n) {
            for(int i=0;i<s.length();i++){
                if (s.charAt(i)=='a')
                    count_ocurrence++;

            }
            return count_ocurrence;
        }

        int times_of_a=0;
        for(long i=0;i<s.length();i++){
            if (s.charAt((int)i)=='a')
                times_of_a++;

        }

        for(long i=0;i<n;){
            if((i+(s.length()))< n ){
                count_ocurrence=count_ocurrence+times_of_a;

                i=i+s.length();

                long time_to_be_mutipled= n/s.length();
                count_ocurrence =count_ocurrence*time_to_be_mutipled;
                i= (i)*time_to_be_mutipled;


            }
            else{
                for(long j=i,index=0;j<n;j++,index++){
                    if (s.toCharArray()[(int)index] =='a')
                        count_ocurrence++;
                    i=i+1;
                }
            }
        }

        return count_ocurrence;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        long result = repeatedString("aadcdaccacabdaabadadaabacdcbcacabbbadbdadacbdadaccbbadbdcadbdcacacbcacddbcbbbaaccbaddcabaacbcaabbaaa", 942885108885L);
        System.out.println(result);

    }
}
