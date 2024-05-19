//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long num1=A,num2=B;
       Long[] ans=new Long[2];
        
        while(num1>0&&num2>0){
            if(num1>num2) num1=num1%num2;
            else num2=num2%num1;
            
        }
        Long gcd= num1==0?num2:num1;
        ans[1]=gcd;
        long lcm=(A*B)/gcd;
        ans[0]=lcm;
        return ans;
    }
    
};