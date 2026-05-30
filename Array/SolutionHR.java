/*
Flatland is a country with a number of cities, some of which have space stations. Cities are numbered consecutively and each has a road of  length connecting it to the next city. It is not a circular route, so the first city doesn't connect with the last city. Determine the maximum distance from any city to its nearest space station.
Sample Input 0

STDIN   Function
-----   --------
5 2     n = 5, c[] size m = 2
0 4     c = [0, 4]
Sample Output 
2
*/ 

import java.util.*;
public class SolutionHR
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] cities = new int[n];
        cities[0] = 0;
        for(int i=1; i<n;i++)
        {
            cities[i] = i;
        }
        
        int m = sc.nextInt();
        int[] space = new int[m];
        for(int i=0; i<m; i++)
        {
           space[i] = sc.nextInt(); 
        }
        sc.close();
        int ans[] = new int[n];
        for(int i=0; i<n; i++)
        {
            ans[i]= Integer.MAX_VALUE;
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(n==m)
                {
                    System.out.println("0");
                    return;
                }
                else if(cities[i]==space[j])
                {
                    ans[i] = 0;
                }
                else
                {   
                    
                    
                    ans[i] = Math.min(ans[i], Math.abs(cities[i] - space[j]));
                    
                    
                }
            }
        }
        int max = Arrays.stream(ans).max().getAsInt();
        System.out.println(max);
        
    }
}
