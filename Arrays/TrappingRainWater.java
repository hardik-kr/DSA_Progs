package Arrays;
class TrappingRainWater 
{

    int max(int num1,int num2)
    {
        if(num1 > num2)
        {
            return num1 ;
        }
        return num2 ;
    }

    int min(int num1,int num2)
    {
        if(num1 > num2)
        {
            return num2 ;
        }
        return num1 ;
    }

    public int trap(int[] height) 
    {
        int size = height.length ;
        int leftmax[] = new int[size] ;
        int rightmax[] = new int[size] ;

        leftmax[0] = height[0] ;
        for(int i=1 ; i<size ; i++)
        {
            leftmax[i] = max(leftmax[i-1],height[i]) ;
        }
        rightmax[size-1] = height[size-1] ;
        for(int i=size-2 ; i>=0 ; i--)
        {
            rightmax[i] = max(rightmax[i+1],height[i]) ;
        }

        int ans = 0;
        for(int i=0 ; i<size ; i++)
        {
            ans = ans + min(leftmax[i],rightmax[i]) - height[i] ;
        }

        return ans ;
        
    }
}
