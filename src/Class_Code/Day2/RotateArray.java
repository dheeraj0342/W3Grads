package Class_Code.Day2;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k =2;
        reverse(arr,0, arr.length-1);
        reverse(arr,0, k-1);
        reverse(arr,k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr , int s , int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
