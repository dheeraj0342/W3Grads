package Class_Code.Day2;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int k =2;
        k = k % arr.length;
        reverse(arr,0, arr.length-1);
        reverse(arr,0, k);
        reverse(arr,k+1, arr.length-1);
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
