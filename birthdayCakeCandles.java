import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        
        int[] sortedArray = sortArray(ar);
        
        /*for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }*/
        
        int result = getDuplicatedNumbers(sortedArray);
        
        return result;
    }
    
    static int[] sortArray(int[] array) {
        
        int aux = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++){
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
    
    static int getDuplicatedNumbers(int[] array){
        
        int duplicated = 1;
        for(int j = 0; j < array.length; j++){
            if(j + 1 == array.length) {
                break;
            }
            if(array[j] == array[j +1]) {
                duplicated++;
            }
        }
        return duplicated;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
 
