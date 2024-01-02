package semester3;


import java.util.*;

class SortStack
{
	// This function return the sorted stack
	public static Stack<Integer> sortstack(Stack<Integer> 
											input)
	{
		Stack<Integer> tmpStack = new Stack<Integer>();
		while(!input.isEmpty())
		{
			// pop out the first element
			int tmp = input.pop();
		
			// while temporary stack is not empty and
			// top of stack is lesser than temp
			while(!tmpStack.isEmpty() && tmpStack.peek() 
												< tmp)
			{
				// pop from temporary stack and 
				// push it to the input stack
			input.push(tmpStack.pop());
			}
			
			// push temp in temporary of stack
			tmpStack.push(tmp);
		}
		return tmpStack;
	}
	
	// Driver Code
	public static void main(String args[])
	{
		Stack<Integer> input = new Stack<Integer>();
		input.add(0);
		input.add(2);
		input.add(8);
		input.add(4);
		input.add(3);
		input.add(1);
                input.add(5);
                input.add(7);
                input.add(9);
                input.add(6);
                
	
		// This is the temporary stack
		Stack<Integer> tmpStack=sortstack(input);
		System.out.println("Sorted numbers are:");
	
		while (!tmpStack.empty())
		{
			System.out.print(tmpStack.pop()+" ");
		} 
	}
}
// This code is contributed by Danish Kaleem
