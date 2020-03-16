import java.util.Scanner;
import java.util.ArrayList;



public class InteructRunner{
	
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> listArgs;
		
		try{
			String exit="no";
			listArgs = new ArrayList<>();
			Calculator calc=new Calculator(listArgs);
			String argument="";
			int argInt;
			
			while(!exit.equals("yes"))
			{
				//listArgs.clear();
				int i=1;
				
				while(!argument.equals("stop"))
				{
					System.out.println("Please, enter " + i + " args or stop");
					argument=scan.next();
					if(calc.isInteger(argument))
					{
							argInt=Integer.valueOf(argument);
							listArgs.add(argInt);
							i++;
							
					}
					
				}
				
				String choiceString="Please, choice operation:"
										+System.lineSeparator()+"	1. add"
										+System.lineSeparator()+"	2. minus"
										+System.lineSeparator()+"	3. multiply"
										+System.lineSeparator()+"	4. div";
							
				System.out.println(choiceString);
				String choice=scan.next();
				calc.choiceOperation(choice,listArgs);
				
				
				System.out.println("Result = "+calc.getResult());
				listArgs.clear();
				calc.clearResult();
				
				System.out.println("yes/no");
				argument="";
				exit=scan.next();
			}
			
		}
		finally
		{
			scan.close();
		}
	}
	
}