class HelloWorld
{   
    private static int Sum(int num1,int num2)
    {
        int temp = num1 + num2 ;
        return temp ;
    }

    public static void main(String[] args)
    {
        int a=10,b=20 ;
        int sum = Sum(a,b) ;
        System.out.print(sum) ;
    }
}