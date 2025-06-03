public class Calculator {
	
	
	
	int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
 
	int fact(int a)
	{
		int f=1;
		for(int i=1;i<=a;i++) {
			f*=i;
		}
		return f;
	}
	
	public boolean isAgeValid(int age) {
		
		return age>=19 && age<=60;
	}
	
	public String getItemById(int id) {
		if(id==101)
		{
			return "Laptop";
		}
		else if(id==102)
		{
			return "books";
		}
		else {
			return null;
		}
	}
	 
}