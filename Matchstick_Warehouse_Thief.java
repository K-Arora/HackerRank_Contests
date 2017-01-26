import java.util.*;

class crate
{
    int boxes;
    int sticks;
    
    crate( int box, int st)
    {
        System.out.println(" "+box + " "+sticks);
        this.boxes = box;
        this.sticks = st;
    }
    public int compareTo( Object o)
    {
        System.out.println("Hello 1");
        crate c = (crate)o;
        if( this.sticks < c.sticks )
            return -1;
          else if( this.sticks < c.sticks )
              return 1;
            else
              return 0;
    }
}
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int crates = in.nextInt();
        PriorityQueue<crate> pq = new PriorityQueue<crate>(n, Collections.reverseOrder() ); 
        for(int i = 0; i < crates; i++)
        {
            crate c = new crate( in.nextInt(), in.nextInt() );
            pq.add( c );
        }
        
        int temp = n;
        int result = 0;
        while( temp > 0 )
        {
            crate c = pq.poll();
            System.out.println(" box "+ c.boxes+"st "+c.sticks);
            if(c.boxes < temp )
            {
                result += c.boxes * c.sticks;
                temp -= c.boxes;
            }
              else if( c.boxes > temp )
              {
                  result += (temp) * c.sticks;
                  temp = 0;
              }
        }
        System.out.println( result );
        // your code goes here
    }
}
