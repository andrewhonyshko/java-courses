public class Calculate{
	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first=Integer.valueOf(arg[0]);
		int second=Integer.valueOf(arg[1]);
		int sum=first+second;
		System.out.println("Sum = "+sum);
		
		long flong=Long.valueOf(arg[2]);
		long slong=Long.valueOf(sum);
		long minus=slong-flong;
		System.out.println("Minus = "+minus);
		
		float oneFloat=Float.valueOf(arg[3]);
		float twoFloat=Float.valueOf(minus);
		float dev=twoFloat/oneFloat;
		System.out.println("DEV = "+dev);
		
		double oneDouble=Double.valueOf(arg[4]);
		double twoDouble=Double.valueOf(dev);
		double multiple=twoDouble*oneDouble;
		System.out.println("Multiple = "+multiple);
	}

}