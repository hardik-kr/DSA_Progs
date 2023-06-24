class EqulibriumPoint 
{
    public static void main(String[] args) 
    {
        int input[] = {1,4,2,3,2} ;
        int ans ;
        //ans = EqulibriumPoint_On(input) ;
        ans = EqulibriumPoint_O1(input) ;
        System.out.println(ans);
    }

    private static int EqulibriumPoint_O1(int[] input) {
        int size = input.length ;
        int rightsum = 0, leftsum = 0, maxsum = 0 ;

        for(int i=0 ; i<size ; i++)
        {
            maxsum = maxsum + input[i] ;
        }

        for(int i=0 ; i<size ; i++)
        {
            rightsum = maxsum - input[i] ;
            if(leftsum == rightsum)
            {
                return i ;
            }
            leftsum = leftsum + input[i] ;
            maxsum = maxsum - input[i] ;
        }

        return -1 ;
    }

    private static int EqulibriumPoint_On(int[] input) {
        int size = input.length ;
        int prefix[] = new int[size] ;
        int maxsum = 0 ;

        for(int i=0 ; i<size ; i++)
        {
            maxsum = maxsum + input[i] ;
            prefix[i] = maxsum ;
        }

        for(int i=1 ; i<size-1 ; i++)
        {
            int leftsum = prefix[i-1] ;
            int rightsum = maxsum - prefix[i] ;

            if(leftsum == rightsum)
            {
                return i ;
            }
        }
        return -1 ;
    }
    
}

/*
 * maxsum =12 ;
 * prefix[] = {1,5,7,10,12}
 * 
 * i=2 =>  leftsum = 5,rightsum = 5
 * 
 * Approch 1 => O(N^2)
 * Approch 2 => O(N)
 * Approch 3 => O(N)
 * 
 */
