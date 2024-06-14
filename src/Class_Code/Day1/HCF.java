package Class_Code.Day1;

public class HCF {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        while(b !=0){
            int temp = a;
            a = b;
            b = temp% b;

        }
        System.out.println(a);
    }
}
