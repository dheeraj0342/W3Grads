package Class_Code.Day3;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,4};
        int i =0;
        while(i<arr.length){
            int check = arr[i]-1;
            if(arr[i] != arr[check]){
                int temp = arr[check];
                arr[check] = arr[i];
                arr[i] = temp;
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
