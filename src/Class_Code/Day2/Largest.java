package Class_Code.Day2;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {1,23,4};
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
