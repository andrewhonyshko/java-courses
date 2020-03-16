import java.util.ArrayList;
/**
* Класс реалезует калькулятор
*/
public class Calculator{
	
	/**
	*Результат вычисление
	*/
	private int result;
	/**
	* Аргументы для вычисление
	*/
	private ArrayList<Integer> params;
	
	/**
	* Конструктор
	* @param listArgs Список аргументів
	*/
	public Calculator(ArrayList<Integer> listArgs )
	{
		super();
		this.params=listArgs;
	}
	/**
	*	Додаэм аргументи
	*/
	public void add()
	{
		for(Integer param:params)
		{
			this.result+=param;
		}
		
	}
	/**
	* Віднімаємо аргументи
	*/
	public void minus()
	{
		int i=0;
		for(Integer param:params)
		{
			if(i==0)
			{	
				this.result=param;
				i++;
			}
			else
			{
				this.result-=param;
			}
			
		}
	}
	/**
	* Множимо аргументи
	*/
	public void multiply()
	{
		int i=0;
		for(Integer param:params)
		{
			if(i==0)
			{	
				this.result=param;
				i++;
			}
			else
			{
				this.result*=param;
			}
			
			
		}
	}
	/**
	* Ділимо аргументи
	*/
	public void div()
	{
		int i=0;
		for(Integer param:params)
		{
			if(i==0)
			{	
				this.result=param;
				i++;

			}
			else
			{
				this.result/=param;
			}
			
		}
	}
	/**
	* Отримуємо результат 
	*/
	public int getResult()
	{
		return this.result;
	}
	/**
	* Очищщаємо результат
	*/
	public void clearResult()
	{
		this.result=0;
	}
	/**
	* Перевірка, чи отримане аргумент є цілим числом
	* @param param отриманий аргумент
	* @throws nfe вийде із програми, якщо аргумент, не ціле число
	*/
	public boolean isInteger(String param)
	{
		if(param==null)
			return false;
		try
		{
			int intParam=Integer.parseInt(param);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}
	/**
	* Вибір операцій
	* @param numOperation вказати номер операцій
	* @param params список аргументів
	*/
	public void choiceOperation(String numOperation,ArrayList<Integer> params)
	{
		
		switch(numOperation)
		{
			case "1":
				this.add();//додавання
				break;
			case "2":
				this.minus();//віднімання
				break;
			case "3":
				this.multiply();//множення
				break;
			case "4":
				this.div();//ділення
				break;
		}
	}
	
	
}