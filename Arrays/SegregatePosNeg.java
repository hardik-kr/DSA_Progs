package Arrays;
public class SegregatePosNeg 
{
    public void Segregate(int arr[])   
    {
        int size = arr.length ;  
        int start = 0, end = size-1 ;
        while(start < end)
        {
            while(arr[start]<0 && start<end)
            {
                start++ ;
            }

            while(arr[end]>0 && start<end)
            {
                end-- ;
            }

            if(start<end)
            {
                int temp = arr[start] ;
                arr[start] = arr[end] ;
                arr[end] = temp ;

                start++ ;
                end-- ;
            }
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    
    }   
}
