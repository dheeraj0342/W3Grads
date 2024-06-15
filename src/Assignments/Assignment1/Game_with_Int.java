package Assignments.Assignment1;

import java.util.Scanner;

public class Game_with_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n % 3==0){
                System.out.println("SECOND");
            }else{
                System.out.println("FIRST");
            }
        }
    }
}
