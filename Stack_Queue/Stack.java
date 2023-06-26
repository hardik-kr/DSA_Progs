package Stack_Queue;
public class Stack
{
    public 
    int top ;
    int MAX_SIZE ;
    int curr_size ;
    int stack[] ;

    Stack(int size)
    {
        this.stack = new int[size] ;  // 'this' in C++/JAVA   == me in ABAP == self in python  me->
        this.MAX_SIZE = size ;
        this.top = -1 ;
        this.curr_size = 0 ;        
    } 

    void push(int val)
    {
        if(curr_size == MAX_SIZE)
        {
            System.out.println("Stack Overflow") ;
        }        
        else
        {
            top = top + 1 ;
            stack[top] = val ;
            curr_size = curr_size + 1;
        }
    }

    void pop()
    {
        if(curr_size == 0)
        {
            System.out.println("Stack Empty") ;
        }
        else
        {
            top = top - 1 ;
            curr_size = curr_size - 1;
        }
    }

    int top()
    {
        if(curr_size == 0)
        {
            System.out.println("Stack Empty") ;
            return -1 ;
        }
        else
        {
            return stack[top] ;
        }
    }

    boolean isEmpty()
    {
        if(curr_size == 0)
        {
            return true ;
        }
        return false ;
    }
};

// class stack
// {
//     public static void main(String[] args) 
//     {
//         StackApi stck = new StackApi(10) ;
//         Scanner sc = new Scanner(System.in) ;

//         while(true)
//         {
//             int inp ;
//             System.out.println("1. Push\n2. Pop\n3. Top\n");
//             System.out.println("Choice : ");
//             inp = sc.nextInt() ;
            
//            switch (inp) 
//            {
//             case 1:
//                 System.out.print("Enter Val : ");
//                 int data ;
//                 data = sc.nextInt() ;
//                 stck.push(data);                               
//                 break;
//             case 2:
//                 stck.pop() ;                            
//                 break;
//             case 3:
//                 System.out.print("Top is : "+stck.top()) ;
//                 break;
//             default :
//                 System.out.print("Wrong Choice") ;
//                 break ;
//            }
//         }
//     }
// }
