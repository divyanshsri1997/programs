	import java.util.*;
	class Main
	{
	    static int pcount,count,ifcount=0,y=0;
    	static void division(int m,int n)
	    {
        	count=0;
        	while(m!=0)
	        {
	            m=m-n;
	            count++;
	            if(ifcount==0)//for only one decimal point
	            {
	                pcount=count;
                }
            	if(m<n && m!=0)
            	{
	                 ifcount++;
	                 y=m;
	                 int i=0;
	                 while(i!=9)
	                 {
	                    y=y+m;
	                    i++;
	                 }
	                break;
        	    }
        	}
	    }
	static void multiplication(int m,int n)
	{
	int x=m;
	while(n!=1)
	{
	x=x+m;
	n--;
	}
	System.out.println(x);
	}
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter two nos:");
	int m=sc.nextInt();
	int n=sc.nextInt();
	System.out.print("press A for multiplication and B for division:");
	String ch=sc.next();
	switch(ch)
	{
	    case "A":
        	multiplication(m,n);
        	break;
    	case "B":
        	division(m,n);
        	if(y>=10)//for finding the decimal
        	{
        	    division(y,n);
        	}
        	else
        	{
        	    count=0;
        	}
	        break;
	   default:
	       System.out.println("Enter a valid input");
	       break;

	}
	System.out.println(pcount+"."+count);
	}
	}
//using a new testing branch
