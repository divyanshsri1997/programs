import java.util.Stack; 
import java.util.Scanner;
public class StringEvaluator
{
	public static boolean validateExpression(String expression)
	{
		char[] tokens = expression.toCharArray();
		int count=0,count1=0;
		for(int i=0;i<tokens.length;i++)
		{
			if(tokens[i]=='(')
			{
				count++;
			}
			else if(tokens[i]==')')
			{
				count1++;
			}
		}
		if(count!=count1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
    public static int evaluateExpression(String expression) 
    { 
        char[] tokens = expression.toCharArray(); 
        Stack<Integer> values = new Stack<Integer>(); 
        Stack<Character> operators = new Stack<Character>(); 
  
        for (int i = 0; i < tokens.length; i++) 
        { 
            if (tokens[i] == ' ')
                continue; 
            if (tokens[i] >= '0' && tokens[i] <= '9') 
            { 
                StringBuffer sb = new StringBuffer(); //to store multiple digits
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
                    sb.append(tokens[i++]); 
                values.push(Integer.parseInt(sb.toString())); 
            } 
            else if (tokens[i] == '(') 
                operators.push(tokens[i]);
            else if (tokens[i] == ')') 
            { 
                while (operators.peek() != '(') 
                  values.push(applyOperation(operators.pop(), values.pop(), values.pop())); 
                operators.pop(); 
            } 
            else if (tokens[i] == '+' || tokens[i] == '-' || 
                     tokens[i] == '*' || tokens[i] == '/') 
            {
                while (!operators.empty() && hasPrecedence(tokens[i], operators.peek()))
                  	values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                operators.push(tokens[i]); 
            } 
        } 
        while (!operators.empty()) 
            values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
        return values.pop(); 
    }
    public static boolean hasPrecedence(char operator1, char operator2) 
    { 
        if (operator2 == '(' || operator2 == ')') 
            return false; 
        if ((operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-')) 
            return false; 
        else
            return true; 
    } 
    public static int applyOperation(char operator, int b, int a) 
    { 
        switch (operator) 
        { 
        case '+': 
            return a + b; 
        case '-': 
            return a - b; 
        case '*': 
            return a * b; 
        case '/': 
            if (b == 0) 
                throw new ArithmeticException("Cannot divide by zero"); 
            return a / b; 
        } 
        return 0; 
    }
}
class DemoStringEvaluator
{
	public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        String expression=sc.nextLine();
        //check whether the string is valid or not
        if(StringEvaluator.validateExpression(expression)==true)
        {
        	float result=StringEvaluator.evaluateExpression(expression);
        	System.out.println(result);
        }
        else
        {
        	System.out.println("Invalid Expression");
        }
    } 
}