package Class_Code.Day4;

public class Max_sum {
    public static void main(String[] args) {
        int [] arr ={1,8,30,-5,20,7};
        int k=3;

        // TC -> O(n * k)
/*       int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i <=arr.length-k; i++) {
            int sum=0;
            for (int j = i; j <i+k ; j++) {
                sum += arr[j];
            }
           maxSum= Math.max(sum,maxSum);
        }
        System.out.println(maxSum);

 */

        //Optimal Solution
        // TC -> O(n)
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        int maxSum = currentSum;
        for (int i = k; i <=arr.length-1 ; i++) {
            currentSum += arr[i] -arr[i-k];
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);

    }
}
