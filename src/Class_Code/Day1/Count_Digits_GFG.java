package Class_Code.Day1;

public class Count_Digits_GFG {
    public static void main(String[] args) {
        int cnt=0;
        int N = 12;
        int num = N;
        while(N >0){
            int digit = N % 10;
            if(digit !=0 && num % digit ==0 ){
                cnt++;
            }
            N /=10;

        }
        System.out.println(cnt);

    }
}
