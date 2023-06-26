//given a binary array, find max number of 1s
//{0,0,1,1,0,1,1,1}
package Arrays;
public class Consecutive_1s 
{
    public int consecutive_codeOptimize(int[] input) 
    {
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

    public int Consecutive(int input[])
    {
        int count = 0, gv_count = 0;
        for(int i = 0; i< input.length; i++)
        {
         if(input[i] == 1)
         {
           count = count + 1;
         }
         else
         {
           if(count != 0 && gv_count < count)
           {
            gv_count = count;
            count = 0;
          }
         }

        }
        if(gv_count < count)
        {
         gv_count = count;

        }
        //System.out.print("The max no. of consucutive ones are"+ " "+gv_count);
        return gv_count ;
    }
}
