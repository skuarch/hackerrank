import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        
        ArrayList<int[]> series = new ArrayList();
        long[] sums;
        
        for(int i = 0; i < arr.length; i++) {
            series.add(createSeries(arr, i));
        }
        
        sums = new long[series.size()];
        for(int i = 0; i < series.size(); i++) {
            sums[i] = sumArray(series.get(i));
        }
        
        /*for(int i = 0; i < sums.length; i++){
            System.out.println(sums[i]);
        }*/
        
        sortArray(sums);
        System.out.println(sums[sums.length -1] + " " + sums[0]);
        
    }
    
    static int[] createSeries(int[] array, int index) {
        int[] newArray = new int[array.length];
        
        for(int i = 0; i < array.length; i++) {
            if(i == index) {
                continue;
            } else {
                newArray[i] = array[i];
            }
        }
        
        /*for(int i = 0; i < newArray.length; i++) {
            System.out.print(" " + newArray[i]);
        }
        System.out.println();*/
        
        return newArray;
    }
    
    public static long sumArray(int[] array){
        
        long result = 0L;
        
        for(int i= 0; i < array.length; i++) {
            result += array[i];
        }
        
        return result;
        
    }
    
    public static long[] sortArray(long[] array) {
        
        long aux;
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                
                if(j + 1 == array.length) {
                    break;
                }
                
                if(array[j] < array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;    
                }
                
            }
        }
        return array;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
