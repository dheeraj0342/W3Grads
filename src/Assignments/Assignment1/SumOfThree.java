package Assignments.Assignment1;


import java.util.ArrayList;
import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum=0;
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=1;i<n;i++){
                if(i % 3 !=0){
                    ans.add(i);
                    sum +=i;
                }
            }
            if(sum != n){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.println(ans);
            }
        }
    }
}
