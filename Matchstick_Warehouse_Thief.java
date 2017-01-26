import java.util.*;

class crate implements Comparable
{
    int boxes;
    int sticks;
    
    crate( int box, int st)
    {
        this.boxes = box;
        this.sticks = st;
    }
    public int compareTo( Object o)
    {
        crate c = (crate)o;
        if( this.sticks < c.sticks )
            return -1;
          else //( this.sticks < c.sticks )
              return 1;
            //else
             // return 0;
    }
}

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int crates = in.nextInt();
        PriorityQueue<crate> pq = new PriorityQueue<crate>(crates, Collections.reverseOrder() ); 
        int a, b, total_a = 0, total =0;
        for(int i = 0; i < crates; i++)
        {
            a = in.nextInt(); 
            b = in.nextInt();
            total += a*b;
            total_a += a;
            crate c = new crate( a, b );
            pq.add( c );
        }
        if(total_a < n )
            System.out.println(total);
        else
       {
            int temp = n;
            int result = 0;
            while( temp > 0 )
            {
                crate c = pq.poll();
                if(c.boxes <= temp )
                {
                    result += c.boxes * c.sticks;
                    temp -= c.boxes;
                }                    
                else if( c.boxes > temp )
                {
                    result += (temp) * c.sticks;
                    break;
                }
            }
            System.out.println( result );

        }
    }
    
}
