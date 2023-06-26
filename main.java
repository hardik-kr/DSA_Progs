import Arrays.*;
import Stack_Queue.*;

class main 
{
    public static void main(String[] args) 
    {
        //Average avg = new Average() ;
        NGL nglobj = new NGL() ;
        int input[] = {10, 5, 11, 6, 20, 12} ;

        int ans[] = nglobj.NearestGreaterLeft(input) ;
        
        for(int i=0 ; i<ans.length ; i++)
        {
            System.out.print(ans[i]+" ");
        }
        
    }
    
}
