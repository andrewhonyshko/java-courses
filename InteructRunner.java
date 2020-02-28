import java.util.Scanner;

public class InteructRunner{
	
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		
		try{
			String exit="no";
			Calculator calc=new Calculator();
			while(!exit.equals("yes"))
			{
				System.out.println("Please, enter first args");
				String first=scan.next();
				System.out.println("Please, enter second args");
				String second=scan.next();
				calc.add(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("Result = "+calc.getResult());
				
				calc.clearResult();
				System.out.println("yes/no");
				exit=scan.next();
			}
			
		}
		finally
		{
			scan.close();
		}
	}
	
}