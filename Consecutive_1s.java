//given a binary array, find max number of 1s
//{0,0,1,1,0,1,1,1}
public class Consecutive_1s 
{
    public static void main(String[] args) {
        int input[] = {0,0,1,1,0,1,1,1};
        int ans = consecutive(input);
        System.out.println(ans);
    }

    private static int consecutive(int[] input) {
        int curr_count = 0, max_count = 0;
        int size = input.length;
        for(int i = 0; i<size; i++)
        {
            if(input[i]==1)
            {
                curr_count+=1;
            }
            else
            {
                curr_count = 0;
            }
            if( curr_count > max_count)
            {
                max_count = curr_count;
                
            }
        }
        return max_count;
    }
    
}
