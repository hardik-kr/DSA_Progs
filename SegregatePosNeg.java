class SegregatePosNeg 
{
    public static void main(String[] args)   
    {
        
        int arr[] = {8,5,-7,-2,10,15} ;
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
