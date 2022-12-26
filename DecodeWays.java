import java.util.*;

public class DecodeWays {
    int result = 0;

    //Timelimit exceeded - For Recursion
    public int numDecodingsRecursion(String s) {
        if(null == s || s.length() == 0){
            return 0;
        }
        numDecodeR(s, 0);
        return result;
    }

    private int numDecodeR(String s, int index) {

        //Edge case
        int n = s.length();

        if(index == n){
            return 1;
        }

        if(s.charAt(index) == '0')
            return 0 ;

        result = numDecodeR(s , index + 1);

        if( index < (n-1) && (s.charAt(index) == '1' || ( s.charAt(index) == '2' && s.charAt(index + 1) < '7' ) ) ){
           result = result + numDecodeR(s, index + 2);
        }
        return result;
    }

    //Memoization

    public int numDecodingsMemoization(String s) {
        if(null == s || s.length() == 0){
            return 0;
        }
        int[] mem;
        mem = new int[s.length()];
        Arrays.fill(mem, -1);
        return numDecodeM(s, 0, mem);
    }

    private int numDecodeM(String s, int index, int[] mem) {

        //Exit condition
        int strlen = s.length();
        if(index == strlen){
            return 1;
        }

        if(s.charAt(index) == '0'){
            return 0;
        }

        if(mem[index] != -1){
            return mem[index];
        }
        int result = numDecodeM(s, index+1, mem);

        if( index < (strlen-1) && (s.charAt(index) == '1' || ( s.charAt(index) == '2' && s.charAt(index + 1) < '7' ) ) ){
            result = result + numDecodeM(s, index + 2,mem);
        }
        mem[index] = result;
        return mem[index];

    }

    //DP
    public int numDecodings(String s) {

        int n = s.length();
        int[] dp = new int[n+1];
        dp[n] = 1;

        for(int i=n-1;i>=0;i--){

            if(s.charAt(i) != '0') {
                dp[i] =dp[i+1];
                if(i<n-1&&(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<'7'))
                    dp[i]+=dp[i+2];

            }
        }

        return dp[0];

    }


}
