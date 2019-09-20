import java.util.*;
class Ramanujan
{
	static int a,b,c,d;
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter input");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			a=i*i*i;
			if(a>n)
			{
				break;
			}
			for(int j=i;j<=n;j++)
			{
				b=j*j*j;
				if(b>n)
				{
					break;
				}
				for(int k=i+1;k<=n;k++)
				{
					c=k*k*k;
					if(c>n)
					{
						break;
					}
					for(int l=k;l<=n;l++)
					{
						d=l*l*l;
						if(d>n)
						{
							break;
						}
						if((a+b)=(c+d))
						{
							System.out.println("ramanujan number is:"+(a+b));
						}
					}
				}
			}
		}
	}
}