package Stack_Queue;
public class NGL 
{
    public int[] NearestGreaterLeft(int arr[])
    {
        int NGLans[] = new int[arr.length] ;
        //Stack<Integer> stck = new Stack<>() ;  // stack with int
        Stack stck = new Stack(arr.length) ;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(stck.curr_size == 0)
            {
                NGLans[i] = -1 ;
            }
            else
            {
                while(stck.curr_size !=0 && arr[i]>= stck.top())
                {
                    stck.pop();
                }
                if(stck.curr_size == 0 )
                {
                    NGLans[i] = -1 ;
                }
                else
                {
                    NGLans[i] = stck.top() ;
                }
            }
            stck.push(arr[i]);            
        }
        return NGLans ;
    }  
}
