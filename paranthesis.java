import java.util.*;
import java.lang.Character;
class Main
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Stack<Character> stack=new Stack<>();
		String s=sc.next();
		char c[]=s.toCharArray();
		stack.push('a');
		for(int i=0;i<s.length();i++)
		{
			if(c[0]==')')
			{
				System.out.println("unbalanced");
				break;
			}
			else if(c[i]=='(')
			{
				stack.push(c[i]);
				System.out.println("pushed: "+c[i]);
			}
			else if(c[i]==')')
			{
				stack.pop();
				System.out.println("popped: "+c[i]);
			}
		}
		if(stack.peek()=='a')
		{
		    System.out.println("It is balanced");
		}
	}
}