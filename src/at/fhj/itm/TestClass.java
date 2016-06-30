package at.fhj.itm;

/**
 * testing the functionalities of the implementation
 * @author Manuel Eder
 *
 */
public class TestClass
{

	public static void main(String[] args)
	{
		StringStack newStack = new StringStack(5);  // make a new Stack
		
		
		// Push strings to the stack
		newStack.push("Test1");
		newStack.push("Test2");
		newStack.push("Test3");
		newStack.push("Test4");
		newStack.push("Test5");
		newStack.push("Test6");
		
		// While the stack isnt empty, give out the strings
		while(!newStack.isEmpty())
			System.out.println(newStack.pop());
	}
}
