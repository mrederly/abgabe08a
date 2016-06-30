package at.fhj.itm;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a Stack-Functionality
 * 
 * @author Manuel Eder
 *
 */
public class StringStack implements Stack
{
	List<String> newStack = new ArrayList<String>();  // To store the strings
	private int max;
	
	/**
	 * if stack is empty
	 * 
	 * @return true if empty stack
	 */
	public StringStack (int max)
	{
		this.max = max;
	}
	
	public boolean isEmpty()
	{
		return newStack.isEmpty();
	}

	/**
	 * pushes a new item to the stack
	 * 
	 * @param item needs to be an String
	 */
	public void push(String item)
	{
		if (newStack.size() < max)
		{
			newStack.add(item);
		}
		else
		{
			System.out.println("Stack voll!");
		}
	}

	/**
	 * gets the item of the Stack
	 * 
	 * @return the item, data type string
	 */
	public String pop()
	{
		if (!newStack.isEmpty())
		{
			String newString = newStack.get(newStack.size()-1);
			newStack.remove(newStack.size()-1);
			return newString;
		}
		else
		{
			System.out.println("Stack leer!");
			return null;
		}
	}
}
