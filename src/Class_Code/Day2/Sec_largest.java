package Class_Code.Day2;

public class Sec_largest {
    public static void main(String[] args) {
        int[] arr = {1,23,4};
        int max1 =Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max1 < arr[i]){
                max2 = max1;
                max1 = arr[i];
            } else if (max1 > arr[i] && max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
