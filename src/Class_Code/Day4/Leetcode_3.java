package Class_Code.Day4;

public class Leetcode_3 {
    public static void main(String[] args) {
        String st = "abcabcbb";
        int currWin =0;
        int maxWin =0;
        int s=0;
        int e =0;
        int[] arr = new int[26];
        while(e < st.length()){
            int index = st.charAt(e)-'a';
            arr[index]++;

            while(arr[index] > 1 && s<e){
                arr[st.charAt(s)-'a']--;
                s++;
            }
            currWin = e-s +1;
            maxWin = Math.max(currWin,maxWin);
            e++;
        }
        System.out.println(maxWin);
    }
}
