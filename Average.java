import java.util.Scanner;
public class Average
{
   public static void main(String[] args)
   {
    //int arr[] = {10, 20, 30, 40, 50};
    int size;
    Scanner input = new Scanner(System.in);
    size = input.nextInt();
    int arr[] = new int[size];
    
    
    int sum = 0;
    for( int i = 0; i<size; i++)
    {
        arr[i] = input.nextInt();
         sum = sum + arr[i];

    }
    float average = sum/arr.length;
    System.out.print(average);

   } 
}
