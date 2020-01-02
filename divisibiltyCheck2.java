import java.util.*;
class DivisibiltyCheck
{
	public static int isDivisible(int n,int d)
	{
    	while(n>d)
    	{
        	n=n-d;
    	}
    	if(n==d)
    	{
        	System.out.println("Divisible by "+d);
        	return 1;
    	}
    	else
    	{
    		System.out.println("Not divisible by "+d);
    		return 0;
    	}
	}
	public static int isDivisibleby3(int n,int d)
	{
		String s=Integer.toString(n);
		int m=0;
		for(int i=0;i<s.length();i++)
		{
			m=m+Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		return isDivisible(m,d);
	}
	public static void isDivisibleby4(int n,int d)
	{
		String s=Integer.toString(n);
		String m="";
		m=String.valueOf(s.charAt(s.length()-2))+String.valueOf(s.charAt(s.length()-1));
		int x=Integer.parseInt(m);
		isDivisible(x,4);
	}
	public static void isDivisibleby5(int n,int d)
	{
		String s=Integer.toString(n);
		String m="";
		m=String.valueOf(s.charAt(s.length()-1));
		int x=Integer.parseInt(m);
		if(x==0 || x==5)
		{
			System.out.println("Divisible by 5");
		}
		else
		{
			System.out.println("Not divisible by 5");
		}
	}
	public static void isDivisibleby6(int n,int d)
	{
		if(isDivisible(n,2)==1 && isDivisibleby3(n,3)==1)
		{
			System.out.println("Therefor Divisible by 6");
		}
		else
		{
			System.out.println("therefor not divisible by 6");
		}
	}
	public static void isDivisibleby8(int n,int d)
	{
		isDivisible(n,d);
	}
	public static void isDivisibleby9(int n,int d)
	{
		isDivisibleby3(n,d);
	}
	
	
}
class newmain
{
    public static void main (String []args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        switch(d)
        {
        	case 2:
        			DivisibiltyCheck.isDivisible(n,d);
        			break;
        	case 3:
        			DivisibiltyCheck.isDivisibleby3(n,d);
        			break;
        	case 4:
        			DivisibiltyCheck.isDivisibleby4(n,d);
        			break;
        	case 5:
        			DivisibiltyCheck.isDivisibleby5(n,d);
        			break;
        	case 6:
        			DivisibiltyCheck.isDivisibleby6(n,d);
        			break;
        	case 8:
        			DivisibiltyCheck.isDivisibleby8(n,d);
        			break;
        	case 9:
        			DivisibiltyCheck.isDivisibleby9(n,d);
        			break;
        	default:
        			System.out.println("Wrong input");
        			break;
        }
    }
}