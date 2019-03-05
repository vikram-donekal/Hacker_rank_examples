package _11;

//INCOMPLETE



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {


    static long countTriplets(List<Long> arr, long r) {


        Map<Long,Long> inputMap= new HashMap<>();

        for (Long input1: arr  ) {

            if (inputMap.containsKey(input1)){
                inputMap.put(input1,inputMap.get(input1)+1);
            }else
                inputMap.put(input1,1L);

        }

        int count =0;
        int innnerCOunt=0;
        int finalCOunt=0;
        for (Long value   : inputMap.keySet()) {


                for(int i=0;i<=2;i++){

                    long valueToComapre=  value * (long) Math.pow(value,i*r);

                    if (inputMap.containsKey(valueToComapre)){
                        count++;

                        if (inputMap.get(valueToComapre) >1){
                                innnerCOunt++;
                        }
                    }



                }
            if (count ==3){


                if (innnerCOunt >0){


                    finalCOunt= finalCOunt +1 +( innnerCOunt);
                }

                innnerCOunt=0;
                count=0;
            }


        }




return  finalCOunt;

    }

    public static void main(String[] args) throws IOException {


        List<Long> arr = Stream.of("1 3 9 9 27 81".split(" "))
                .map(Long::parseLong)
                .collect(toList());


        long ans = countTriplets(arr, 3);
        System.out.println(ans);
}
}
