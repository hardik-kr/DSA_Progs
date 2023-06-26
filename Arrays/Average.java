package Arrays;
public class Average
{
   public float CalcAverage(int arr[])
   {
      //int arr[] = {10, 20, 30, 40, 50};
      int size = arr.length ;
      int sum = 0;
      for( int i = 0; i<size; i++)
      {
         sum = sum + arr[i];
      }
      float average = sum/arr.length;
      return average ;
   } 
}
