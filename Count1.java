//{0,0,1,1,1} max no of consecutive 1s.
public class Count1 
{
    public static void main(String[] args) 
    {
        int input[] = {0,0,1,1,1};
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
        System.out.print("The max no. of consucutive ones are"+ " "+gv_count);
    }
}
