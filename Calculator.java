import java.util.ArrayList;
public class Calculator{
	
	private int result;
	private ArrayList<Integer> params;
	
	public Calculator(ArrayList<Integer> listArgs)
	{
		this.params=listArgs;
	}
	
	//public void add(ArrayList<Integer> params)
	//{
		//this.listArgs=params;
	//	for(Integer param:params)
		//{
			//this.result+=param;
		//}
		
	//}
	public void add()
	{
		//this.listArgs=params;
		for(Integer param:params)
		{
			this.result+=param;
		}
		
	}
	public void minus()
	{
		int i=0;
		for(Integer param:params)
		{
			if(i==0)
			{	
				this.result=param;
			}
			else
			{
				this.result-=param;
			}
			i++;
			
		}
	}
	public void multiply()
	{
		int i=0;
		for(Integer param:params)
		{
			if(i==0)
			{	
				this.result=param;
			}
			else
			{
				this.result*=param;
			}
			i++;
			
		}
	}
	public void div()
	{
		int i=0;
		for(Integer param:params)
		{
			if(i==0)
			{	
				this.result=param;
			}
			else
			{
				this.result/=param;
			}
			i++;
			
		}
	}
	
	public int getResult()
	{
		return this.result;
	}
	public void clearResult()
	{
		this.result=0;
	}
	public boolean isInteger(String strParam)
	{
		if(strParam==null)
			return false;
		try
		{
			int intParam=Integer.parseInt(strParam);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}
	public void choiceOperation(String numOperation,ArrayList<Integer> params)
	{
		
		
		//String numOperation=scan.next();
		
		switch(numOperation)
		{
			case "1":
				add();
				break;
			case "2":
				this.minus();
				break;
			case "3":
				multiply();
				break;
			case "4":
				div();
				break;
		}
	}
	
	
}