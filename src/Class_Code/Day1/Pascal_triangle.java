package Class_Code.Day1;

public class Pascal_triangle {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            int ncr =1;
            for (int j = 0; j < n; j++) {
                if(ncr !=0)
                    System.out.print(ncr+" ");
                ncr = ncr * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
