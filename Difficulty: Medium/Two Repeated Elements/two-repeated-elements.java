//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String l = br.readLine();
            String[] sarr = l.split(" ");
            int[] arr = new int[sarr.length];
            for (int i1 = 0; i1 < arr.length; i1++) {
                arr[i1] = Integer.parseInt(sarr[i1]);
            }

            Solution obj = new Solution();

            int[] res = obj.twoRepeated(n, arr);
            System.out.println(res[0] + " " + res[1]);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function template for JAVA

class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
        int[] ans = new int[2];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int val=hm.get(arr[i]);
                hm.remove(arr[i]);
                hm.put(arr[i],val+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> i : hm.entrySet())
        {
            if(i.getValue()==2)
            {
                ans[k]=i.getKey();
                k++;
            }
        }
        return ans;
    }
}