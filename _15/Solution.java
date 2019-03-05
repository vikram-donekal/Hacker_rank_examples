package _15;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {

        int totalAlerts =0;

        if (expenditure.length <=d )
            return  0;

        for (int i=d ,temp=0;i<expenditure.length;i++,temp++){


            List<Integer> sorted = Arrays.stream(expenditure).parallel().mapToObj(e -> (int) e).skip(temp).limit(d).sorted().collect(Collectors.toList());

            int meadianValue=0;

            if (sorted.size()/2==0)
            {
                int quotient = sorted.size() % 2;

                meadianValue = (sorted.get(quotient)+sorted.get(quotient+1) )/2;
            }else
            {
                meadianValue=sorted.get(sorted.size()/2);
            }


            if ( expenditure[i] >= (2 * meadianValue) ){
                totalAlerts ++;
            }
       }

return totalAlerts;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int [] expenditure = Stream.of(("" +
                "").split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = activityNotifications(expenditure, 40001);
        System.out.println(result       );

    }
}
