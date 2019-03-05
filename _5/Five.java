package Five;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Five {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int row_colum=arr.length;
        ArrayList<Integer> count=new ArrayList<>();
        for (int i=0;i<row_colum;i++) {

            for(int  j=0;j<row_colum;j++){

                try{
                    int value_to_sum_up=0;
                    value_to_sum_up= value_to_sum_up+arr[i][j];
                    value_to_sum_up= value_to_sum_up+arr[i][j+1];
                    value_to_sum_up= value_to_sum_up+arr[i][j+2];
                    value_to_sum_up= value_to_sum_up+arr[i+1][j+1];
                    value_to_sum_up= value_to_sum_up+arr[i+2][j];
                    value_to_sum_up= value_to_sum_up+arr[i+2][j+1];
                    value_to_sum_up= value_to_sum_up+arr[i+2][j+2];
                    count.add(value_to_sum_up);
                }
                catch (Exception e){

                }

            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<count.size(); i++){
            if(count.get(i) > max){
                max = count.get(i);
            }
        }
        return max;



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
