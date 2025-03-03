//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();

            Solution obj = new Solution();
            System.out.println(obj.lastIndex(s));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int lastIndex(String s) {
        int c=0;
        int t=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='1')
            {
                c=i;
                t++;
            }
        }
        if(t>0) return c;
        else    return -1;
    }
}