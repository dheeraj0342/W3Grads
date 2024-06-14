package Class_Code.Day1;

import java.util.ArrayList;

public class Leetcode_pascal_II {
    public static void main(String[] args) {
        int n =3;
        int ncr=1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            ans.add(ncr);
            ncr = ncr * (n-i)/(i+1);
        }
        System.out.println(ans);
    }
}
