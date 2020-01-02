import java.util.*;
class DivisibiltyCheck
{
	public static void isDivisible(int n,int d)
	{
    	while(n>d)
    	{
        	n=n-d;
    	}
    	if(n==d)
    	{
        	System.out.println("Divisible by "+d);
    	}
    	else
    	{
    		System.out.println("Not divisible by "+d);
    	}
	}
}
class Main
{
    public static void main (String []args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int d=2;
        while(d<10)
        {
        	DivisibiltyCheck.isDivisible(n,d);
        	d++;
        }
    }
}
