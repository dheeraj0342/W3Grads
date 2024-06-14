package Class_Code.Day3;

import java.util.Arrays;

public class Insertion_sort {


    public static void main(String[] args) {
        int[] arr = {1,4,5,6,2};
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j =i-1;
            while(j>=0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        System.out.println(Arrays.toString(arr));
    }
}
