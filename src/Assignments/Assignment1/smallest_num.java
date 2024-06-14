package Assignments.Assignment1;

public class smallest_num {
    public static void main(String[] args) {
        long n = 375;
        long k =4;
        System.out.println(lcm(n,(long)Math.pow(10,k)));
    }
    static long lcm(long A , long B) {

        long a = A;
        long b = B;
        while(B !=0){
            long temp = A;
            A = B;
            B = temp % A;
        }
        return a * b / A;

    }
}
