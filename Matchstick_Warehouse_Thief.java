import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class crate
{
    int boxes;
    int sticks;
    
    fire( int box, int st)
    {
        this.boxes = box;
        this.sticks = st;
    }
    public int compareTo()
    {
        
    }

}
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int crates = in.nextInt();
        PriorityQueue<crate> pq = new PriorityQueue<Crate>(n, Collections.reverseOrder() ); 
        for(int crate_i=0; crate_i < c; crate_i++)
        {
            crate c = new crate(sc.nextInt(), sc.nextInt() );
        }
        // your code goes here
    }
}
