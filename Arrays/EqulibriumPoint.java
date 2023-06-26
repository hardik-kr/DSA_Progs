package Arrays;
public class EqulibriumPoint 
{
    public int EqulibriumPoint_O1(int[] input) {
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

    public int EqulibriumPoint_On(int[] input) {
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
